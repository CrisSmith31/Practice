
/**
 * You left your computer unlocked and your friend decided to troll you by copying a lot of your files to random spots
 * all over your file system.
 *
 * Even worse, she saved the duplicate files with random, embarrassing names ("this_is_like_a_digital_wedgie.txt"
 * was clever, I'll give her that).
 *
 * Write a method that returns a list of all the duplicate files. We'll check them by hand before actually deleting
 * them, since programmatically deleting files is really scary. To help us confirm that two files are actually
 * duplicates, return a list of FilePaths objects with variables for the original and duplicate paths
 *
 * For example:
 *
 *[(duplicate: /tmp/parker_is_dumb.mpg, original: /home/parker/secret_puppy_dance.mpg),
 * (duplicate: /home/trololol.mov, original: /etc/apache2/httpd.conf)]
 *
 * You can assume each file was only duplicated once.
 */

public class FindDuplicateFiles {

    public static String myFunction(String arg) {

        return "running with " + arg;
    }

    public static void main(String[] args) {

        // run your function through some test cases here
        // remember: debugging is half the battle!
        String testInput = "test input";
        System.out.println(myFunction(testInput));
    }

}
