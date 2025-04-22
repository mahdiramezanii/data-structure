fun main() {

    var myNumber = arrayOf<Int>(30, 1, 232, 1, 0, 823, 4, 43, 12, 91, 17, 8);



    for (i in 0..myNumber.size - 1) {

        for (j in 0..myNumber.size - 1) {

            if (j + 1 < myNumber.size) {

                if (myNumber[j] > myNumber[j + 1]) {

                    var swap = myNumber[j];

                    myNumber[j] = myNumber[j + 1];
                    myNumber[j + 1] = swap;
                }
            }
        }
    }

    for(number in myNumber){
        print(number);
        print(",")
    }
}
