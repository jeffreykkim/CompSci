import greenfoot.*; 
import java.util.*;
import java.lang.Math.*;
/**
 * A 'Body' is any kind of object in space that has a mass. It could be 
 * a star, or a planet, or anything else that floats around in space.
 * 
 * @author Michael Kölling 
 * @version 0.2
 */
public class Body extends SmoothMover
{
    // constants
    private static final double GRAVITY = 5.8;
    private static final Color defaultColor = new Color(84, 255, 159);
    public static final Vector DEFVECTOR = new Vector(0,1.0);

    // fields
    private double mass;
    private List<Body> bodyList;
    private double dx;
    private double dy;
    private double distance;
    private double force;
    private double acceleration;
    private Vector dv;
    /**
     * Construct a Body with default size, mass, velocity and color.
     */
    public Body()
    {
        this (20, 300, new Vector(0, -1.0), defaultColor);
    }

    /**
     * Construct a Body with a specified size, mass, velocity and color.
     */
    public Body(int size, double mass, Vector velocity, Color color)
    {
        this.mass = mass;
        addToVelocity(velocity);
        GreenfootImage image = new GreenfootImage (size, size);
        image.setColor(color);
        image.fillOval (0, 0, size-1, size-1);
        setImage (image);
    }

    /**
     * Act. That is: apply  the gravitation forces from
     * all other bodies around, and then move.
     */
    public void act() 
    {
        bounceAtEdge();
        applyForces();
        move();
    }

    /**
     * Return the mass of this body.
     */
    public double getMass() 
    {
        return mass;
    }

    public void applyForces()
    {
        bodyList = getWorld().getObjects(Body.class);
        for (int i = 0; i < bodyList.size(); i++)
        {
            if (bodyList.get(i) != this)
            {
                applyGravity(bodyList.get(i));
            }
        }
    }

    private void applyGravity(Body otherBody)
    {
        dx = otherBody.getX() - this.getX();
        dy = otherBody.getY() - this.getY();
        distance = (Math.hypot(dx,dy));
        force = (GRAVITY*((this.getMass()*otherBody.getMass())/(Math.pow(distance,2))));
        acceleration = force/this.getMass();
        dv = new Vector(dx,dy);
        dv.setLength(acceleration);
        addToVelocity(dv);
    }
    
    private void bounceAtEdge()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1)
        {
            setLocation((double)getX(), (double)getY());
            invertHorizontalVelocity();
            accelerate(0.9);
        }
        else if (getY() == 0 || getY() == getWorld().getHeight()-1)
        {
            setLocation((double)getX(), (double)getY());
            invertVerticalVelocity();
            accelerate(0.9);
        }
    }
}
