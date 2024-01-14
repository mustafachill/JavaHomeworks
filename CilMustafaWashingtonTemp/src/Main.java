/***********************************************************************
 @Title:	CilMustafaWashingtonTemp.java
 @Purpose:	To get familiar with arrays and their usage
 @Author:    (Cil Mustafa)
 @Date:   	(13.01.2024)
 @Version:	1.0
 ************************************************************************/

import java.util.Random;
public class Main {
    // if we want a random number between x-y,
    // (y-x+1) + x;           95 - 89 = 6 -> 6+1 = 7
    public static void main(String[] args) {
        Random random = new Random();

        int days[] = new int[366];
        int sumTemp = 0;
        double averageTemp = 0;
        int smallestTemperature = 50;
        int coldestDayIndex = 0;
        int biggestTemperature = 50;
        int hottestDayIndex = 0;
        String currentMonthForHottest = "";
        String currentMonthForColdest = "";
        String currentDayForHottest = "";
        String currentDayForColdest = "";
        int numberOfTheHottestDay = 0;
        int numberOfTheColdestDay = 0;

        int hotDayCounter = 0;
        int coldDayCounter = 0;

        for (int i = 0 ; i < days.length; i++) {
            if (i + 1 <= 31) {
                // current month is January
                // limit is 25–38 -> 38-25+1 = 14
                days[i] = random.nextInt(14) + 25;
                sumTemp = sumTemp + days[i];
                if (i + 1 == 31) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for January is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 31 && i <= 60) {
                // current month is February
                // limit is 26-40 -> 15
                days[i] = random.nextInt(15) + 26;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 60) {
                    averageTemp = sumTemp / 29;
                    System.out.println("Average temperature for February is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 60 && i <= 91) {
                // current month is March
                // limit is 34-48 -> 15
                days[i] = random.nextInt(15) + 34;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 91) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for March is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 91 && i <= 121) {
                // current month is April
                // limit is 43-58 -> 16
                days[i] = random.nextInt(16) + 43;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 121) {
                    averageTemp = sumTemp / 30;
                    System.out.println("Average temperature for April is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 121 && i <= 152) {
                // current month is May
                // limit is 52-68 -> 17
                days[i] = random.nextInt(17) + 52;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 152) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for May is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 152 && i <= 182) {
                // current month is June
                // limit is 62-77 -> 16
                days[i] = random.nextInt(16) + 62;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 182) {
                    averageTemp = sumTemp / 30;
                    System.out.println("Average temperature for June is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 182 && i <= 213) {
                // current month is July
                // limit is 68-83 -> 16
                days[i] = random.nextInt(16) + 68;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 213) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for July is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 213 && i <= 244) {
                // current month is August
                // limit is 60-75 -> 16
                days[i] = random.nextInt(16) + 60;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 244) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for August is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 244 && i <= 274) {
                // current month is September
                // limit is 49-65 -> 17
                days[i] = random.nextInt(17) + 49;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 274) {
                    averageTemp = sumTemp / 30;
                    System.out.println("Average temperature for September is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 274 && i <= 305) {
                // current month is October
                // limit is 41-54 -> 14
                days[i] = random.nextInt(14) + 41;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 305) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for October is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 305 && i <= 335) {
                // current month is November
                // limit is 31-43 -> 13
                days[i] = random.nextInt(13) + 31;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 335) {
                    averageTemp = sumTemp / 30;
                    System.out.println("Average temperature for November is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            } else if (i + 1 > 335 && i <= 366) {
                // current month is December
                // limit is 47-61 -> 15
                days[i] = random.nextInt(15) + 47;

                sumTemp = sumTemp + days[i];
                if (i + 1 == 366) {
                    averageTemp = sumTemp / 31;
                    System.out.println("Average temperature for January is: " + averageTemp);
                    averageTemp = 0;
                    sumTemp = 0;
                }
            }


            if (days[i] > biggestTemperature) {
                biggestTemperature = days[i];
                hottestDayIndex = i;
            }

            if (days[i] < smallestTemperature ){
                smallestTemperature = days[i];
                coldestDayIndex = i;
            }


            // below 33 - more than 75
            if (days[i] < 33) {
                coldDayCounter++;
            }
            if (days[i] > 75) {
                hotDayCounter++;
            }

        }

        // for find the hottest day's month
        currentMonthForHottest = monthFinder(hottestDayIndex);

        // for find the coldest day's month
        currentMonthForColdest = monthFinder(coldestDayIndex);

        // for find the hottest day
        currentDayForHottest = dayFinder(hottestDayIndex);
        // for find the coldest day
        currentDayForColdest = dayFinder(coldestDayIndex);

        // for find the number of the hottest day
        numberOfTheHottestDay = dayNumberFinder(hottestDayIndex);
        // for find the number of the hottest day
        numberOfTheColdestDay = dayNumberFinder(coldestDayIndex);


        System.out.println("The hottest day in the entire year was on " + currentDayForHottest + ", " + currentMonthForHottest + " " + numberOfTheHottestDay);
        System.out.println("It was " + biggestTemperature + " degree F on this day.");

        System.out.println("The coldest day in the entire year was on " + currentDayForColdest + ", " + currentMonthForColdest + " " + numberOfTheColdestDay);
        System.out.println("It was " + smallestTemperature + " degree F on this day.");

        System.out.println("There were " + hotDayCounter + " days where the temperature was above 75 degrees");
        System.out.println("There were " + coldDayCounter + " days where the temperature was below 33 degrees");
    }

    public static String monthFinder(int dayIndex) {
        String currentMonthHolder = "";
        if (dayIndex + 1 <= 31) {
            // current month is January
            currentMonthHolder = "January";
        } else if (dayIndex + 1 > 31 && dayIndex <= 60) {
            // current month is February
            currentMonthHolder = "February";
        } else if (dayIndex + 1 > 60 && dayIndex <= 91) {
            // current month is March
            currentMonthHolder = "March";
        } else if (dayIndex + 1 > 91 && dayIndex <= 121) {
            // current month is April
            currentMonthHolder = "April";
        } else if (dayIndex + 1 > 121 && dayIndex <= 152) {
            // current month is May
            currentMonthHolder = "May";
        } else if (dayIndex + 1 > 152 && dayIndex <= 182) {
            // current month is June
            currentMonthHolder = "June";
        } else if (dayIndex + 1 > 182 && dayIndex <= 213) {
            // current month is July
            currentMonthHolder = "July";
        } else if (dayIndex + 1 > 213 && dayIndex <= 244) {
            // current month is August
            currentMonthHolder = "August";
        } else if (dayIndex + 1 > 244 && dayIndex <= 274) {
            // current month is September
            currentMonthHolder = "September";
        } else if (dayIndex + 1 > 274 && dayIndex <= 305) {
            // current month is October
            currentMonthHolder = "October";
        } else if (dayIndex + 1 > 305 && dayIndex <= 335) {
            // current month is November
            currentMonthHolder = "November";
        } else if (dayIndex + 1 > 335 && dayIndex <= 366) {
            // current month is December
            currentMonthHolder = "December";
        }
        return currentMonthHolder;

    }

    public static String dayFinder(int dayIndex) {
        String currentDayHolder = "";
        int number = dayIndex % 7;
        switch (number) {
            case 0:
                currentDayHolder = "Monday";
                break;
            case 1:
                currentDayHolder = "Tuesday";
                break;
            case 2:
                currentDayHolder = "Wednesday";
                break;
            case 3:
                currentDayHolder = "Thursday";
                break;
            case 4:
                currentDayHolder = "Friday";
                break;
            case 5:
                currentDayHolder = "Saturday";
                break;
            case 6:
                currentDayHolder = "Sunday";
                break;
        }
        return currentDayHolder;
    }

    public static int dayNumberFinder(int dayIndex) {
        int currentDayNumber = 0;
        if (dayIndex + 1 <= 31) {
            // current month is January
            currentDayNumber = dayIndex + 1;
        } else if (dayIndex + 1 > 31 && dayIndex <= 60) {
            // current month is February
            currentDayNumber = (dayIndex + 1) - 31;
        } else if (dayIndex + 1 > 60 && dayIndex <= 91) {
            // current month is March
            currentDayNumber = (dayIndex + 1) - 60;
        } else if (dayIndex + 1 > 91 && dayIndex <= 121) {
            // current month is April
            currentDayNumber = (dayIndex + 1) - 91;
        } else if (dayIndex + 1 > 121 && dayIndex <= 152) {
            // current month is May
            currentDayNumber = (dayIndex + 1) - 121;
        } else if (dayIndex + 1 > 152 && dayIndex <= 182) {
            // current month is June
            currentDayNumber = (dayIndex + 1) - 152;
        } else if (dayIndex + 1 > 182 && dayIndex <= 213) {
            // current month is July
            currentDayNumber = (dayIndex + 1) - 182;
        } else if (dayIndex + 1 > 213 && dayIndex <= 244) {
            // current month is August
            currentDayNumber = (dayIndex + 1) - 213;
        } else if (dayIndex + 1 > 244 && dayIndex <= 274) {
            // current month is September
            currentDayNumber = (dayIndex + 1) - 244;
        } else if (dayIndex + 1 > 274 && dayIndex <= 305) {
            // current month is October
            currentDayNumber = (dayIndex + 1) - 274;
        } else if (dayIndex + 1 > 305 && dayIndex <= 335) {
            // current month is November
            currentDayNumber = (dayIndex + 1) - 305;
        } else if (dayIndex + 1 > 335 && dayIndex <= 366) {
            // current month is December
            currentDayNumber = (dayIndex + 1) - 335;
        }
        return currentDayNumber;

    }

}