package CrackingTheCodingInterview;

public class Main {
    public static void main(String[] args){

        /**
         * Matrix Rotation by 90 degree
         * */
//        RearrangeWithoutConsec rwc = new RearrangeWithoutConsec();
//        System.out.println(rwc.reArragne("aaaaaabb"));

//        MatrixRotation mr = new MatrixRotation();
//        int mat[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
//        mr.rotateRecursive(mat[0].length,mat,0);
//        mr.rotateMatrix(mat[0].length,mat);
//        mr.displayMatrix(mat[0].length,mat);


        /**
         * Loop Detection using Rabbit and Tortoise algorithm
         * */
//        LoopDetectLL<Integer> lld = new LoopDetectLL<Integer>();
//        for(int i=0;i<20;i++){
//            lld.insertAtEnd(i);
//        }
//        lld.createLoop();// randomly create a loop
//        System.out.println("loop is detected at "+lld.detectLoop());
//        System.out.println(lld);    //printing the list till twice the size to check if the loop was correctly detected


        /**
         * Permutations of a String
         * */
//        StringPermutation sp = new StringPermutation();
//        sp.getPermutation("abcdefghij");

        /**
         * Coin Change or make sum from subset
         */
//        CoinChangeProblem ccp = new CoinChangeProblem();
//        System.out.println(ccp.getSubsets(new int[]{1,2,3},4));

        /**
         * All subsets of an array
         */
//        SubsetArrays sa = new SubsetArrays();
//        sa.getSubset(new int[]{1,2,3});

        /**
         * find pair of sums
         */
//        PairSum ps = new PairSum();
//        ps.singlePair(new int[]{1,2,3,4,4},5);

        /**
         * First recurring character in a string
         */
//        FirstRecurringChar frc = new FirstRecurringChar();
//        System.out.println(frc.getFirstRecurringCharacter("dbcaba"));

        /**
         * Implement a queue with single stack
         */
//        QueueStack<Integer> qs = new QueueStack<Integer>();
//        qs.enque(12);
//        qs.enque(13);
//        qs.enque(14);
//        qs.enque(15);
//        qs.enque(16);
//        qs.enque(17);
//        qs.printStack();
//        qs.dequeue();
//        qs.printStack();
//        qs.dequeue();
//        qs.printStack();qs.dequeue();
//        qs.printStack();


        /**
         * Sum of triplets
         */
//        Triplets t = new Triplets();
//        System.out.println(t.sumTripletIterative(new int[]{-2, 0, 1, 1, 2},0));

        /**
         * NQueens solution
         */
//        NQueen nq = new NQueen(5);
//        System.out.println(nq.findNQueens());


        /**
         * Maximum square of 1's in a matrix of 0's and 1's
         */
//        MaximumSquareOfOne msoo = new MaximumSquareOfOne(new int[][]{{1,1,0,1,0},{0,1,1,1,1},{1,1,1,1,1},{0,1,1,1,1},{0,1,1,1,1}});
//        System.out.println(msoo.getMaxSquare());

        /**
         * Min Max ina an Array with single pass.
         * */
//        MinMax mm = new MinMax();
//        mm.printMinMax(new int[]{1,3,4,5,22,2,3,6,5,-1,3,0,6});


//        EditDistanceDP edDp = new EditDistanceDP();
//        System.out.println(edDp.iterativeEditDistance("sunday","saturday"));

        Puzzles p = new Puzzles();
        p.solvePuzzleOne(
                new int[][]{{1,2,3},
                            {8,0,6},
                            {7,5,4}},
                1,1);
    }
}

//1,2,3
//8,0,6
//7,5,4
