    package com.annotationsPractice;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.context.annotation.Scope;
    import org.springframework.stereotype.Component;

    import javax.annotation.PostConstruct;
    import javax.annotation.PreDestroy;

    @Component
    @Scope
    public class TennisCoach implements Coach {

        @Autowired
        @Qualifier("randomFortuneService")
        private FortuneService fortuneService;

//        @Autowired
//        public TennisCoach(FortuneService fortuneService) {
//            this.fortuneService = fortuneService;
//        }

        //define a default constructor
        public TennisCoach(){
            System.out.println("tennis Coach: inside the constructor");
        }

        //define a setter method
//        @Autowired
//        public void doSomeCrazyStuff(FortuneService theFortuneService){
//            System.out.println("inside the setter method ");
//            fortuneService= theFortuneService;
//        }

        //define my init method
        @PostConstruct
        public void doMyStartupStuff(){
            System.out.println("inside my startup stuff");
        }

        //define my destroy method
        @PreDestroy
        public void doMyCleanupStuff(){
            System.out.println("inside my clean up stuff");
        }

        @Override
        public String getDailyWorkout() {
            return "practice your backhand volley";
        }

        @Override
        public String getDailyFortune() {
            return fortuneService.getFortune();
        }



    }
