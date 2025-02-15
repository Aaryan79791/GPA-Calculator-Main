import java.util.*;
public class MainGPA 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //introduction
        System.out.println("Welcome to the GPA Calculator! This easy-to-use tool helps you calculate your Grade Point Average (GPA) quickly and accurately. Simply input your course grades and credits, and let the app do the rest. \nTrack your academic performance and stay on top of your educational goals with this simple, efficient tool.");
        System.out.println();
        System.out.print("What is your current grade level? ");
        int level = console.nextInt();
        System.out.print("Which semester are you in(1 | 2)? ");
        int semester = console.nextInt();
        System.out.println();
        //main variables
        double totalGPA = 0;
        double grade = 0;
        int credits = 0;
        String truncatedGPA;
        //general to make sure user reaching high school very soon
        if(level >= 7)
        {
            //always given no matter what bc user at least went through one semester
            System.out.println("Given below is the list of categorized courses you were able to take in middle school/summer school before the beginning of high school - ");
            System.out.println("Mathematics: Algebra 1\tAlgebra 1 Advanced\tGeometry\tGeometry Advanced\tAlgebra 2\tAlgebra 2 Advanced");
            System.out.println("World Languages: Spanish 1\tSpanish 2");
            System.out.println("Electives: Health\tProfessional Communications");
            System.out.println();
            System.out.println("*Exclude entering CBEd(Credit By Exam) Courses as they do not contribute to your GPA and are only for credit completion");
            System.out.print("How many courses did you take during middle school/summer school? If you did not take any please enter \"0\" >>> ");
            int courseNum = console.nextInt();
            if(courseNum == 0)
            {
                if(level <= 8)
                {
                    System.out.println("Thank you for using this app please do use this again when you reach high school as this app is a great resource for your academic success!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("That's absolutely fine let's move on to the high school courses!");
                }    
            }
             //used to determine for loop
            System.out.println();
            for(int i = 1; i <= courseNum; i++)
            {
                grade = 0;
                double calculate = 0;
                console.nextLine();
                System.out.print("Enter a course you took during middle school/summer school: ");
                //account for if user did not take a course during this time period
                String course = console.nextLine();
                if(course.equals("Health") || course.equals("Professional Communications"))
                {
                    System.out.print("Grade: ");
                    grade = console.nextDouble();
                    calculate = 100 - grade;
                    grade = 5.0 - (calculate * 0.1);
                    totalGPA += grade; 
                    System.out.println();
                    credits++;
                }
                else if(semester == 1 &&  level <= 8)
                {
                    //on levels
                    if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 1") || course.equals("Geometry") || course.equals("Algebra 2"))
                    {
                            System.out.print("Grade: ");
                            grade = console.nextDouble();
                            calculate = 100 - grade;
                            grade = 5.0 - (calculate * 0.1);
                            totalGPA += grade; 
                            System.out.println();
                            credits++;
                        }
                        //advanced courses
                        else if(course.equals("Algebra 1 Advanced") || course.equals("Geometry Advanced") || course.equals("Algebra 2 Advanced"))
                        {
                            System.out.print("Grade: ");
                            grade = console.nextDouble();
                            calculate = 100 - grade;
                            grade = 5.5 - (calculate * 0.1);
                            totalGPA += grade; 
                            System.out.println();
                            credits++;
                        }
                    }
                    else
                    {
                        //on levels
                        if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 1") || course.equals("Geometry") || course.equals("Algebra 2"))
                        {
                            System.out.print("Semester 1 Grade: ");
                            grade = console.nextDouble();
                            calculate = 100 - grade;
                            grade = 5.0 - (calculate * 0.1);
                            totalGPA += grade; 
                            System.out.print("Semester 2 Grade: ");
                            grade = console.nextDouble();
                            calculate = 100 - grade;
                            grade = 5.0 - (calculate * 0.1);
                            totalGPA += grade; 
                            System.out.println();
                            credits+= 2;
                        }
                        //advanced courses
                        else if(course.equals("Algebra 1 Advanced") || course.equals("Geometry Advanced") || course.equals("Algebra 2 Advanced"))
                        {
                            System.out.print("Semester 1 Grade: ");
                            grade = console.nextDouble();
                            calculate = 100 - grade;
                            grade = 5.5 - (calculate * 0.1);
                            totalGPA += grade; 
                            System.out.print("Semester 2 Grade: ");
                            grade = console.nextDouble();
                            calculate = 100 - grade;
                            grade = 5.5 - (calculate * 0.1);
                            totalGPA += grade; 
                            System.out.println();
                            credits += 2;
                        }
                    }
                }
                if (credits > 0) 
                { 
                    truncatedGPA = String.format("%.3f", (totalGPA / credits)); 
                    System.out.println("Middle School Averaged GPA: " + truncatedGPA);
                    System.out.println();
                } 
                else 
                {
                    System.out.println("Middle School Averaged GPA: No courses taken.");
                    System.out.println();
                }
            
                if(level >= 9)
                {
                    System.out.println("Given below is the list of categorized courses you were able to take in your Freshman year of high school - ");
                    System.out.println("Mathematics: Algebra 1        Algebra 1 Advanced        Geometry        Geometry Advanced        Algebra 2        Algebra 2 Advanced        PreCalculus        AP PreCalculus");
                    System.out.println("Language Arts: English 1        English 1 Advanced        GT Humanities");
                    System.out.println("Science: Biology        Biology Advanced        AP Biology        AP Physics 1");
                    System.out.println("Social Studies: World Geography        AP Human Geography");
                    System.out.println("World Languages: Spanish 1        Spanish 2        Spanish 3 Advanced        AP Spanish 4        French 1");
                    System.out.println("Technology: Computer Science 1 Advanced        AP Computer Science Principles        3D Modeling & Animation");
                    System.out.println("Physical Education: Lifetime Fitness and Wellness        Lifetime Recreation and Outdoor Education        Off Campus PE");
                    System.out.println("Sports: Football        Soccer        Basketball        Tennis        Swimming        Diving        Baseball        Softball        Wrestling        Track        Cross Country        Volleyball        Cheerleading        Golf");
                    System.out.println("CTEC: Survey of Architecture        Intro to Engineering Design");
                    System.out.println("Fine Arts: Art 1        Art 1 Advanced        Band        Orchestra        Choir        Colorguard        Theater        Dance");
                    System.out.println("Electives: Health        Professional Communications        Medical Terminology        BIM        Debate");
                    System.out.println();
                    System.out.print("How many courses did you take during your Freshman year? ");
                    int courseNum1 = console.nextInt();
                    System.out.println();
                for(int i = 1; i <= courseNum1; i++)
                {
                    grade = 0;
                    double calculate = 0;
                    console.nextLine();
                    System.out.print("Enter a course you took during your Freshman year: ");
                    //account for if user did not take a course during this time period
                    String course = console.nextLine();
                    if(semester == 1 &&  level <= 9)
                    {
                        //on levels
                        if(course.equals("Health") || course.equals("Professional Communications"))
                        {
                                System.out.print("Grade: ");
                                grade = console.nextDouble();
                                calculate = 100 - grade;
                                grade = 5.0 - (calculate * 0.1);
                                totalGPA += grade; 
                                System.out.println();
                                credits++;
                        }
                        else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 1") || course.equals("Geometry") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("PreCalculus") || course.equals("English 1") || course.equals("Biology") || course.equals("World Geography") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness and Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 1") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate") || course.equals("Dance"))
                        {
                                System.out.print("Grade: ");
                                grade = console.nextDouble();
                                calculate = 100 - grade;
                                grade = 5.0 - (calculate * 0.1);
                                totalGPA += grade; 
                                System.out.println();
                                credits++;
                            }
                            
                            //advanced courses
                            else if(course.equals("Algebra 1 Advanced") || course.equals("Geometry Advanced") || course.equals("Algebra 2 Advanced") || course.equals("English 1 Advanced") || course.equals("GT Humanities") || course.equals("Biology Advanced") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced"))
                            {
                                System.out.print("Grade: ");
                                grade = console.nextDouble();
                                calculate = 100 - grade;
                                grade = 5.5 - (calculate * 0.1);
                                totalGPA += grade; 
                                System.out.println();
                                credits++;
                            }
                            //ap courses
                            if(course.equals("AP PreCalculus") || course.equals("AP Human Geography") || course.equals("AP Spanish 4") || course.equals("AP Physics 1") || course.equals("AP Biology") || course.equals("AP Computer Science Principles"))
                            {
                                System.out.print("Grade: ");
                                grade = console.nextDouble();
                                calculate = 100 - grade;
                                grade = 6.0 - (calculate * 0.1);
                                totalGPA += grade; 
                                System.out.println();
                                credits++;
                            }
                        }
                        else
                        {
                            //on levels
                            if(course.equals("Health") || course.equals("Professional Communications"))
                            {
                                    System.out.print("Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 5.0 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.println();
                                    credits++;
                            }
                            else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 1") || course.equals("Geometry") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("PreCalculus") || course.equals("English 1") || course.equals("Biology") || course.equals("World Geography") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness and Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 1") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate") || course.equals("Dance"))
                            {
                                    System.out.print("Semester 1 Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 5.0 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.print("Semester 2 Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 5.0 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.println();
                                    credits += 2;
                                }
                                //advanced courses
                                else if(course.equals("Algebra 1 Advanced") || course.equals("Geometry Advanced") || course.equals("Algebra 2 Advanced") || course.equals("English 1 Advanced") || course.equals("GT Humanities") || course.equals("Biology Advanced") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced"))
                                {
                                    System.out.print("Semester 1 Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 5.5 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.print("Semester 2 Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 5.5 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.println();
                                    credits += 2;
                                }
                                //ap courses
                                if(course.equals("AP PreCalculus") || course.equals("AP Human Geography") || course.equals("AP Spanish 4") || course.equals("AP Physics 1") || course.equals("AP Biology") || course.equals("AP Computer Science Principles"))
                                {
                                    System.out.print("Semester 1 Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 6.0 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.print("Semester 2 Grade: ");
                                    grade = console.nextDouble();
                                    calculate = 100 - grade;
                                    grade = 6.0 - (calculate * 0.1);
                                    totalGPA += grade; 
                                    System.out.println();
                                    credits += 2;
                                }
                            }
                        }
                        truncatedGPA = String.format("%.3f", (totalGPA / credits)); 
                        System.out.println("Freshman Year Averaged GPA: " + truncatedGPA);
                        System.out.println();
                        //sophmore year
                        if(level >= 10)
                        {
                            System.out.println("Given below is the list of categorized courses you were able to take in your Sophomore year of high school - ");
                            System.out.println("Mathematics: Geometry        Geometry Advanced        Algebra 2        Algebra 2 Advanced        PreCalculus        AP PreCalculus        AP Calculus AB        AP Statistics");
                            System.out.println("Language Arts: English 2        English 2 Advanced");
                            System.out.println("Science: Chemistry        Chemistry Advanced        AP Chemistry        AP Biology        AP Physics 1        AP Physics 2        AP Enviromental Science");
                            System.out.println("Social Studies: World History        AP World History        GT Humanities        AP European History");
                            System.out.println("World Languages: Spanish 1        Spanish 2        Spanish 3 Advanced        AP Spanish 4        AP Spanish 5        French 1        French 2");
                            System.out.println("Technology: Computer Science 1 Advanced        AP Computer Science Principles        3D Modeling & Animation        AP Computer Science A");
                            System.out.println("Physical Education: Lifetime Fitness and Wellness        Lifetime Recreation and Outdoor Education        Off Campus PE");
                            System.out.println("Sports: Football        Soccer        Basketball        Tennis        Swimming        Diving        Baseball        Softball        Wrestling        Track        Cross Country        Volleyball        Cheerleading        Golf");
                            System.out.println("CTEC: Survey of Architecture        Intro to Engineering Design");
                            System.out.println("Fine Arts: Art 1        Art 1 Advanced        Art 2        Art 2 Advanced        Art 2 Ceramics        AP Art 2D        AP Art 3D        AP Drawing        Band        Orchestra        Choir        Colorguard        Theater        Dance");
                            System.out.println("Electives: Health        Professional Communications        Medical Terminology        BIM        Debate        AP Seminar        AP Psychology        AP Art History        AP Music Theory");
                            System.out.println();
                            System.out.print("How many courses did you take during your Sophomore year? ");
                            int courseNum2 = console.nextInt();
                            System.out.println();
                        for(int i = 1; i <= courseNum2; i++)
                        {
                            grade = 0;
                            double calculate = 0;
                            console.nextLine();
                            System.out.print("Enter a course you took during your Sophomore year: ");
                            //account for if user did not take a course during this time period
                            String course = console.nextLine();
                            if(semester == 1 &&  level <= 10)
                            {
                                //on levels
                                if(course.equals("Health") || course.equals("Professional Communications"))
                                {
                                        System.out.print("Grade: ");
                                        grade = console.nextDouble();
                                        calculate = 100 - grade;
                                        grade = 5.0 - (calculate * 0.1);
                                        totalGPA += grade; 
                                        System.out.println();
                                        credits++;
                                }
                                else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Geometry") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("French 2") || course.equals("PreCalculus") || course.equals("English 2") || course.equals("Chemistry") || course.equals("World History") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness and Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 2") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate") || course.equals("Dance"))
                                {
                                        System.out.print("Grade: ");
                                        grade = console.nextDouble();
                                        calculate = 100 - grade;
                                        grade = 5.0 - (calculate * 0.1);
                                        totalGPA += grade; 
                                        System.out.println();
                                        credits++;
                                    }
                                    //advanced courses
                                    else if(course.equals("Geometry Advanced") || course.equals("Algebra 2 Advanced") || course.equals("English 2 Advanced") || course.equals("Chemistry Advanced") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced") || course.equals("Art 2 Advanced") || course.equals("Art 2 Ceramics"))
                                    {
                                        System.out.print("Grade: ");
                                        grade = console.nextDouble();
                                        calculate = 100 - grade;
                                        grade = 5.5 - (calculate * 0.1);
                                        totalGPA += grade; 
                                        System.out.println();
                                        credits++;
                                    }
                                    //ap courses
                                    else if(course.equals("AP PreCalculus") || course.equals("AP Statistics") || course.equals("AP Calculus AB") || course.equals("AP World History") || course.equals("AP European History") || course.equals("AP Spanish 4") || course.equals("AP Spanish 5") || course.equals("AP Physics 1") || course.equals("AP Physics 2") || course.equals("AP Biology") || course.equals("AP Chemistry") || course.equals("AP Enviromental Science") || course.equals("AP Computer Science Principles") || course.equals("AP Computer Science A") || course.equals("GT Humanities") || course.equals("AP Art 2D") || course.equals("AP Art 3D") || course.equals("AP Drawing") || course.equals("AP Art History") || course.equals("AP Music Theory") || course.equals("AP Seminar") || course.equals("AP Psychology"))
                                    {
                                        System.out.print("Grade: ");
                                        grade = console.nextDouble();
                                        calculate = 100 - grade;
                                        grade = 6.0 - (calculate * 0.1);
                                        totalGPA += grade; 
                                        System.out.println();
                                        credits++;
                                    }
                                }
                                else
                                {
                                    //on levels
                                    if(course.equals("Health") || course.equals("Professional Communications"))
                                    {
                                            System.out.print("Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 5.0 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.println();
                                            credits++;
                                    }
                                    else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Geometry") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("French 2") || course.equals("PreCalculus") || course.equals("English 2") || course.equals("Chemistry") || course.equals("World History") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness and Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 2") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate") || course.equals("Dance"))
                                    {
                                            System.out.print("Semester 1 Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 5.0 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.print("Semester 2 Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 5.0 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.println();
                                            credits += 2;
                                        }
                                        //advanced courses
                                        else if(course.equals("Geometry Advanced") || course.equals("Algebra 2 Advanced") || course.equals("English 2 Advanced") || course.equals("Chemistry Advanced") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced") || course.equals("Art 2 Advanced") || course.equals("Art 2 Ceramics"))
                                        {
                                            System.out.print("Semester 1 Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 5.5 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.print("Semester 2 Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 5.5 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.println();
                                            credits += 2;
                                        }
                                        //ap courses
                                        else if(course.equals("AP PreCalculus") || course.equals("AP Statistics") || course.equals("AP Calculus AB") || course.equals("AP World History") || course.equals("AP European History") || course.equals("AP Spanish 4") || course.equals("AP Spanish 5") || course.equals("AP Physics 1") || course.equals("AP Physics 2") || course.equals("AP Biology") || course.equals("AP Chemistry") || course.equals("AP Enviromental Science") || course.equals("AP Computer Science Principles") || course.equals("AP Computer Science A") || course.equals("GT Humanities") || course.equals("AP Art 2D") || course.equals("AP Art 3D") || course.equals("AP Drawing") || course.equals("AP Art History") || course.equals("AP Music Theory") || course.equals("AP Seminar") || course.equals("AP Psychology"))
                                        {
                                            System.out.print("Semester 1 Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 6.0 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.print("Semester 2 Grade: ");
                                            grade = console.nextDouble();
                                            calculate = 100 - grade;
                                            grade = 6.0 - (calculate * 0.1);
                                            totalGPA += grade; 
                                            System.out.println();
                                            credits += 2;
                                        }
                                    }
                                }
                                truncatedGPA = String.format("%.3f", (totalGPA / credits)); 
                                System.out.println("Sophomore Year Averaged GPA: " + truncatedGPA);
                                System.out.println(); 
                                
                                //junior year
                                if(level >= 11)
                                {
                                    System.out.println("Given below is the list of categorized courses you were able to take in your Junior year of high school - ");
                                    System.out.println("Mathematics: Algebra 2        Algebra 2 Advanced        PreCalculus        AP PreCalculus        AP Calculus AB        AP Calculus BC        AP Statistics");
                                    System.out.println("Language Arts: English 3        AP English Language        GT American Studies        DC English 3");
                                    System.out.println("Science: AP Chemistry        AP Biology       Physics        AP Physics 1        AP Physics 2        AP Physics C        AP Enviromental Science");
                                    System.out.println("Social Studies: US History        AP US History        AP European History");
                                    System.out.println("World Languages: Spanish 1        Spanish 2        Spanish 3 Advanced        AP Spanish 4        AP Spanish 5        French 1        French 2        French 3");
                                    System.out.println("Technology: Computer Science 1 Advanced        AP Computer Science Principles        3D Modeling & Animation        AP Computer Science A        Computer Science 3 Advanced");
                                    System.out.println("Physical Education: Lifetime Fitness and Wellness        Lifetime Recreation and Outdoor Education        Off Campus PE");
                                    System.out.println("Sports: Football        Soccer        Basketball        Tennis        Swimming        Diving        Baseball        Softball        Wrestling        Track        Cross Country        Volleyball        Cheerleading        Golf");
                                    System.out.println("CTEC: Survey of Architecture        Intro to Engineering Design");
                                    System.out.println("Fine Arts: Art 1        Art 1 Advanced        Art 2        Art 2 Advanced        Art 2 Ceramics        AP Art 2D        AP Art 3D        AP Drawing        Band        Orchestra        Choir        Colorguard        Theater        Dance");
                                    System.out.println("Electives: Health        Professional Communications        Medical Terminology        BIM        Debate        AP Seminar        AP Research        AP Psychology        AP Art History        AP Music Theory");
                                    System.out.println();
                                    System.out.print("How many courses did you take during your Junior year? ");
                                    int courseNum3 = console.nextInt();
                                    System.out.println();
                                for(int i = 1; i <= courseNum3; i++)
                                {
                                    grade = 0;
                                    double calculate = 0;
                                    console.nextLine();
                                    System.out.print("Enter a course you took during your Junior year: ");
                                    //account for if user did not take a course during this time period
                                    String course = console.nextLine();
                                    if(semester == 1 &&  level <= 11)
                                    {
                                        //on levels
                                        if(course.equals("Health") || course.equals("Professional Communications"))
                                        {
                                                System.out.print("Grade: ");
                                                grade = console.nextDouble();
                                                calculate = 100 - grade;
                                                grade = 5.0 - (calculate * 0.1);
                                                totalGPA += grade; 
                                                System.out.println();
                                                credits++;
                                        }
                                        else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("French 2") || course.equals("French 3") || course.equals("PreCalculus") || course.equals("English 3") || course.equals("Physics") || course.equals("US History") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness and Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 2") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate"))
                                        {
                                                System.out.print("Grade: ");
                                                grade = console.nextDouble();
                                                calculate = 100 - grade;
                                                grade = 5.0 - (calculate * 0.1);
                                                totalGPA += grade; 
                                                System.out.println();
                                                credits++;
                                            }
                                            //advanced courses
                                            else if(course.equals("Algebra 2 Advanced") || course.equals("DC English 3") || course.equals("Chemistry Advanced") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced") || course.equals("Art 2 Advanced") || course.equals("Art 2 Ceramics"))
                                            {
                                                System.out.print("Grade: ");
                                                grade = console.nextDouble();
                                                calculate = 100 - grade;
                                                grade = 5.5 - (calculate * 0.1);
                                                totalGPA += grade; 
                                                System.out.println();
                                                credits++;
                                            }
                                            //ap courses
                                            else if(course.equals("AP PreCalculus") || course.equals("AP Statistics") || course.equals("AP Calculus AB") || course.equals("AP Calculus BC") || course.equals("GT American Studies") || course.equals("AP US History") || course.equals("AP European History") || course.equals("AP Spanish 4") || course.equals("AP Spanish 5") || course.equals("AP Physics 1") || course.equals("AP Physics 2") || course.equals("AP Physics C") || course.equals("AP Biology") || course.equals("AP Chemistry") || course.equals("AP Enviromental Science") || course.equals("AP Computer Science Principles") || course.equals("AP Computer Science A") || course.equals("Computer Science 3 Advanced") || course.equals("AP Art 2D") || course.equals("AP Art 3D") || course.equals("AP Drawing") || course.equals("AP Art History") || course.equals("AP Music Theory") || course.equals("AP Seminar") || course.equals("AP Research") || course.equals("AP Psychology"))
                                            {
                                                System.out.print("Grade: ");
                                                grade = console.nextDouble();
                                                calculate = 100 - grade;
                                                grade = 6.0 - (calculate * 0.1);
                                                totalGPA += grade; 
                                                System.out.println();
                                                credits++;
                                            }
                                        }
                                        else
                                        {
                                            //on levels
                                            if(course.equals("Health") || course.equals("Professional Communications"))
                                            {
                                                    System.out.print("Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 5.0 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.println();
                                                    credits++;
                                            }
                                            else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("French 2") || course.equals("French 3") || course.equals("PreCalculus") || course.equals("English 3") || course.equals("Physics") || course.equals("US History") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness and Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 2") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate"))
                                            {
                                                    System.out.print("Semester 1 Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 5.0 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.print("Semester 2 Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 5.0 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.println();
                                                    credits += 2;
                                                }
                                                //advanced courses
                                                else if(course.equals("Algebra 2 Advanced") || course.equals("DC English 3") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced") || course.equals("Art 2 Advanced") || course.equals("Art 2 Ceramics"))
                                                {
                                                    System.out.print("Semester 1 Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 5.5 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.print("Semester 2 Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 5.5 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.println();
                                                    credits += 2;
                                                }
                                                //ap courses
                                                else if(course.equals("AP PreCalculus") || course.equals("AP Statistics") || course.equals("AP Calculus AB") || course.equals("AP Calculus BC") || course.equals("GT American Studies") || course.equals("AP US History") || course.equals("AP European History") || course.equals("AP Spanish 4") || course.equals("AP Spanish 5") || course.equals("AP Physics 1") || course.equals("AP Physics 2") || course.equals("AP Physics C") || course.equals("AP Biology") || course.equals("AP Chemistry") || course.equals("AP Enviromental Science") || course.equals("AP Computer Science Principles") || course.equals("AP Computer Science A") || course.equals("Computer Science 3 Advanced") || course.equals("AP Art 2D") || course.equals("AP Art 3D") || course.equals("AP Drawing") || course.equals("AP Art History") || course.equals("AP Music Theory") || course.equals("AP Seminar") || course.equals("AP Research") || course.equals("AP Psychology"))
                                                {
                                                    System.out.print("Semester 1 Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 6.0 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.print("Semester 2 Grade: ");
                                                    grade = console.nextDouble();
                                                    calculate = 100 - grade;
                                                    grade = 6.0 - (calculate * 0.1);
                                                    totalGPA += grade; 
                                                    System.out.println();
                                                    credits += 2;
                                                }
                                            }
                                        }
                                        truncatedGPA = String.format("%.3f", (totalGPA / credits)); 
                                        System.out.println("Junior Year Averaged GPA: " + truncatedGPA);
                                        System.out.println();
                                        //senior year
                                        if(level >= 12)
                                        {
                                            System.out.println("Given below is the list of categorized courses you were able to take in your Junior year of high school - ");
                                            System.out.println("Mathematics: PreCalculus        AP PreCalculus        AP Calculus AB        AP Calculus BC        DC Calculus 3        AP Statistics");
                                            System.out.println("Language Arts: English 4        AP English Literature        DC English 4");
                                            System.out.println("Science: AP Chemistry        AP Biology       Physics        AP Physics 1        AP Physics 2        AP Physics C        AP Enviromental Science");
                                            System.out.println("Social Studies: Government        AP Government        Economics        AP Macroeconomics        AP European History");
                                            System.out.println("World Languages: Spanish 1        Spanish 2        Spanish 3 Advanced        AP Spanish 4        AP Spanish 5        French 1        French 2        French 3        AP French 4");
                                            System.out.println("Technology: Computer Science 1 Advanced        AP Computer Science Principles        3D Modeling & Animation        AP Computer Science A        Computer Science 3 Advanced");
                                            System.out.println("Physical Education: Lifetime Fitness and Wellness        Lifetime Recreation and Outdoor Education        Off Campus PE");
                                            System.out.println("Sports: Football        Soccer        Basketball        Tennis        Swimming        Diving        Baseball        Softball        Wrestling        Track        Cross Country        Volleyball        Cheerleading        Golf");
                                            System.out.println("CTEC: Survey of Architecture        Intro to Engineering Design");
                                            System.out.println("Fine Arts: Art 1        Art 1 Advanced        Art 2        Art 2 Advanced        Art 2 Ceramics        AP Art 2D        AP Art 3D        AP Drawing        Band        Orchestra        Choir        Colorguard        Theater        Dance");
                                            System.out.println("Electives: Health        Professional Communications        Medical Terminology        BIM        Debate        AP Seminar        AP Research        AP Psychology        AP Art History        AP Music Theory");
                                            System.out.println();
                                            System.out.print("How many courses did you take during your Senior year? ");
                                            int courseNum4 = console.nextInt();
                                            System.out.println();
                                        for(int i = 1; i <= courseNum4; i++)
                                        {
                                            grade = 0;
                                            double calculate = 0;
                                            console.nextLine();
                                            System.out.print("Enter a course you took during your Senior year: ");
                                            //account for if user did not take a course during this time period
                                            String course = console.nextLine();
                                            if(semester == 1 &&  level <= 12)
                                            {
                                                //on levels
                                                if(course.equals("Health") || course.equals("Professional Communications"))
                                                {
                                                        System.out.print("Grade: ");
                                                        grade = console.nextDouble();
                                                        calculate = 100 - grade;
                                                        grade = 5.0 - (calculate * 0.1);
                                                        totalGPA += grade; 
                                                        System.out.println();
                                                        credits++;
                                                }
                                                else if(course.equals("AP Government") || course.equals("AP Macroeconomics"))
                                                {
                                                        System.out.print("Grade: ");
                                                        grade = console.nextDouble();
                                                        calculate = 100 - grade;
                                                        grade = 6.0 - (calculate * 0.1);
                                                        totalGPA += grade; 
                                                        System.out.println();
                                                        credits++;
                                                }
                                                else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("French 2") || course.equals("French 3") || course.equals("PreCalculus") || course.equals("English 4") || course.equals("Physics") || course.equals("Government") || course.equals("Economics") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness & Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 2") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate"))
                                                {
                                                        System.out.print("Grade: ");
                                                        grade = console.nextDouble();
                                                        calculate = 100 - grade;
                                                        grade = 5.0 - (calculate * 0.1);
                                                        totalGPA += grade; 
                                                        System.out.println();
                                                        credits++;
                                                    }
                                                    //advanced courses
                                                    else if(course.equals("DC Calculus 3") || course.equals("DC English 4") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced") || course.equals("Art 2 Advanced") || course.equals("Art 2 Ceramics"))
                                                    {
                                                        System.out.print("Grade: ");
                                                        grade = console.nextDouble();
                                                        calculate = 100 - grade;
                                                        grade = 5.5 - (calculate * 0.1);
                                                        totalGPA += grade; 
                                                        System.out.println();
                                                        credits++;
                                                    }
                                                    //ap courses
                                                    else if(course.equals("AP PreCalculus") || course.equals("AP Statistics") || course.equals("AP Calculus AB") || course.equals("AP Calculus BC") || course.equals("AP European History") || course.equals("AP Spanish 4") || course.equals("AP Spanish 5") || course.equals("AP French 4") || course.equals("AP Physics 1") || course.equals("AP Physics 2") || course.equals("AP Physics C") || course.equals("AP Biology") || course.equals("AP Chemistry") || course.equals("AP Enviromental Science") || course.equals("AP Computer Science Principles") || course.equals("AP Computer Science A") || course.equals("Computer Science 3 Advanced") || course.equals("AP Art 2D") || course.equals("AP Art 3D") || course.equals("AP Drawing") || course.equals("AP Art History") || course.equals("AP Music Theory") || course.equals("AP Seminar") || course.equals("AP Research") || course.equals("AP Psychology"))
                                                    {
                                                        System.out.print("Grade: ");
                                                        grade = console.nextDouble();
                                                        calculate = 100 - grade;
                                                        grade = 6.0 - (calculate * 0.1);
                                                        totalGPA += grade; 
                                                        System.out.println();
                                                        credits++;
                                                    }
                                                }
                                                else
                                                {
                                                    //on levels
                                                    if(course.equals("Health") || course.equals("Professional Communications"))
                                                    {
                                                            System.out.print("Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 5.0 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.println();
                                                            credits++;
                                                    }
                                                    else if(course.equals("AP Government") || course.equals("AP Macroeconomics"))
                                                    {
                                                            System.out.print("Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 6.0 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.println();
                                                            credits++;
                                                    }
                                                    else if(course.equals("Spanish 1") || course.equals("Spanish 2") || course.equals("Algebra 2") || course.equals("French 1") || course.equals("French 2") || course.equals("French 3") || course.equals("PreCalculus") || course.equals("English 4") || course.equals("Physics") || course.equals("Government") || course.equals("Economics") || course.equals("3D Modeling & Animation") || course.equals("Lifetime Fitness & Wellness") || course.equals("Lifetime Recreation and Outdoor Wellness") || course.equals("Off Campus PE") || course.equals("Football") || course.equals("Soccer") || course.equals("Basketball") || course.equals("Tennis") || course.equals("Swimming") || course.equals("Diving") || course.equals("Baseball") || course.equals("Softball") || course.equals("Wrestling") || course.equals("Track") || course.equals("Cross Country") || course.equals("Volleyball") || course.equals("Cheerleading") || course.equals("Golf") || course.equals("Survey of Architecture") || course.equals("Intro to Engineering Design") || course.equals("Art 2") || course.equals("Band") || course.equals("Orchestra") || course.equals("Choir") || course.equals("Colorguard") || course.equals("Theater") || course.equals("Medical Terminology") || course.equals("BIM") || course.equals("Debate"))
                                                    {
                                                            System.out.print("Semester 1 Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 5.0 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.print("Semester 2 Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 5.0 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.println();
                                                            credits += 2;
                                                        }
                                                        //advanced courses
                                                        else if(course.equals("DC Calculus 3") || course.equals("DC English 4") || course.equals("Spanish 3 Advanced") || course.equals("Computer Science 1 Advanced") || course.equals("Art 1 Advanced") || course.equals("Art 2 Advanced") || course.equals("Art 2 Ceramics"))
                                                        {
                                                            System.out.print("Semester 1 Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 5.5 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.print("Semester 2 Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 5.5 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.println();
                                                            credits += 2;
                                                        }
                                                        //ap courses
                                                        else if(course.equals("AP PreCalculus") || course.equals("AP Statistics") || course.equals("AP Calculus AB") || course.equals("AP Calculus BC") || course.equals("AP European History") || course.equals("AP Spanish 4") || course.equals("AP Spanish 5") || course.equals("AP French 4") || course.equals("AP Physics 1") || course.equals("AP Physics 2") || course.equals("AP Physics C") || course.equals("AP Biology") || course.equals("AP Chemistry") || course.equals("AP Enviromental Science") || course.equals("AP Computer Science Principles") || course.equals("AP Computer Science A") || course.equals("Computer Science 3 Advanced") || course.equals("AP Art 2D") || course.equals("AP Art 3D") || course.equals("AP Drawing") || course.equals("AP Art History") || course.equals("AP Music Theory") || course.equals("AP Seminar") || course.equals("AP Research") || course.equals("AP Psychology"))
                                                        {
                                                            System.out.print("Semester 1 Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 6.0 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.print("Semester 2 Grade: ");
                                                            grade = console.nextDouble();
                                                            calculate = 100 - grade;
                                                            grade = 6.0 - (calculate * 0.1);
                                                            totalGPA += grade; 
                                                            System.out.println();
                                                            credits += 2;
                                                        }
                                                    }
                                                }
                                                truncatedGPA = String.format("%.3f", (totalGPA / credits)); 
                                                System.out.println("Senior Year Averaged GPA: " + truncatedGPA);
                                                System.out.println(); 
                                            }   
                                    }  
                                    
                            }        
                }
        }
        console.close();
    }
}   
