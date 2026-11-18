/**
 * PA7 Part 1 heap worksheet.
 * Fill in the arrays with your manually traced answers.
 * Use null for unused slots at the end of each row.
 * Style is not graded for this file.
 */
public class Worksheet {
    /**
     * Q1. Binary max-heap snapshots after the 3rd, 6th, 9th, and
     * 12th insertions, in that order.
     *
     * @return a 4-by-12 array of heap snapshots
     */
    public static Integer[][] insertionResult() {
        Integer[][] output = {
            {25, 2, 15, null, null, null, null, null, null, null, null, null},
            {68, 30, 15, 2, 25, 5, null, null, null, null, null, null},
            {75, 68, 59, 31, 25, 5, 15, 2, 30, null, null, null},
            {84, 75, 59, 31, 70, 5, 15, 2, 30, 25, 68, 1}
        };
        return output;
    }

    /**
     * Q2. Binary min-heap snapshots after each of five removals.
     *
     * @return a 5-by-12 array of heap snapshots
     */
    public static Integer[][] removalResult() {
        Integer[][] output = {
            {0, 38, 21, 39, 42, 74, 30, 47, 50, 54, 44, null},
            {21, 38, 30, 39, 42, 74, 44, 47, 50, 54, null, null},
            {30, 38, 44, 39, 42, 74, 54, 47, 50, null, null, null},
            {38, 39, 44, 47, 42, 74, 54, 50, null, null, null, null},
            {39, 42, 44, 47, 50, 74, 54, null, null, null, null, null}
        };
        return output;
    }

    /**
     * Q3. Max-heap snapshots after the 5th, 10th, and 16th insertions.
     * output[0] contains the three snapshots for d = 3.
     * output[1] contains the three snapshots for d = 4.
     *
     * @return a 2-by-3-by-16 array of heap snapshots
     */
    public static Integer[][][] dResult() {
        Integer[][][] output = {
            {
                {38, 33, 36, 25, 27, null, null, null, null, null, null, null, null, null, null, null},
                {79, 43, 65, 25, 27, 33, 38, 36, 60, 11, null, null, null, null, null, null},
                {82, 79, 65, 65, 43, 33, 38, 36, 60, 11, 4, 25, 19, 27, 14, 10}
            },
            {
                {38, 33, 36, 25, 27, null, null, null, null, null, null, null, null, null, null, null},
                {79, 65, 36, 25, 27, 33, 38, 43, 60, 11, null, null, null, null, null, null},
                {82, 65, 65, 79, 27, 33, 38, 43, 60, 11, 4, 36, 19, 25, 14, 10}
            }
        };
        return output;
    }

    /**
     * Q4. Three-ary max-heap snapshots after each operation group.
     * Each group starts from the result of the preceding group.
     *
     * @return a 5-by-12 array of heap snapshots
     */
    public static Integer[][] heapOperations() {
        Integer[][] output = {
            {52, 50, 35, 39, 45, 17, 27, 10, 15, null, null, null},
            {100, 50, 35, 52, 45, 17, 27, 10, 15, 15, 39, null},
            {52, 50, 35, 39, 45, 17, 27, 10, 15, 15, null, null},
            {88, 50, 35, 72, 45, 17, 27, 10, 15, 15, 39, 52},
            {39, 27, 35, 10, 15, 17, 15, null, null, null, null, null}
        };
        return output;
    }
}
