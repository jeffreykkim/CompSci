/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    public static void testKeepOnlyBlue()
    {

        Picture beach = new Picture("beach.jpg");
        Pixel[][] pixels = beach.getPixels2D();
        for (Pixel[] rowArray: pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
        beach.explore();

    }

    public static void testGrayscale()
    {
        Picture beach = new Picture("beach.jpg");
        Pixel[][] pixels = beach.getPixels2D();
        for (Pixel[] rowArray: pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                int i = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3;
                pixelObj.setRed(i);
                pixelObj.setGreen(i);
                pixelObj.setBlue(i);
            }
        }
        beach.explore();
    }

    public static void testVerticalRightToLeft()
    {
        Picture beach = new Picture("beach.jpg");
        Pixel[][] pixels = beach.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        } 
        beach.explore();
    }
    
    public static void testMirrorArms()
    {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }
    
    public static void testMirrorGull()
    {
        Picture gull = new Picture("seagull.jpg");
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }
    
    public static void testCopy()
    {
        Picture wall = new Picture("wall.jpg");
        Picture blank = new Picture("640x480.jpg");        
        wall.explore();
        blank.copy(wall,88,505,92,434);
        blank.explore();
    }   
    
    public static void createCollage()
    {
        Picture blank = new Picture("640x480.jpg");        
        blank.createCollage();
        blank.explore();
    }
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        testVerticalRightToLeft();
        //testMirrorTemple();
        testMirrorArms();
        testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}