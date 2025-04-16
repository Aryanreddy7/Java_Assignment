package com.xworkz.Runner;

import com.xworkz.internal.AccuWeather;
import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        AccuWeather accuWeather = new AccuWeather();
        accuWeather.showCurrentWeather();
        accuWeather.showForecast();
        accuWeather.sendAlert();
        System.out.println("================================");

        AmazonEcho amazonEcho = new AmazonEcho();
        amazonEcho.playMusic();
        amazonEcho.pauseMusic();
        amazonEcho.setAlarm();
        System.out.println("================================");

        Alexa alexa=new Alexa();
        alexa.controlLights();
        alexa.controlThermostat();
        alexa.monitorSecurity();
        System.out.println("================================");

        Amazon amazon=new Amazon();
        amazon.addToCart();
        amazon.browseItems();
        amazon.checkout();
        System.out.println("================================");

        AcousticGuitar acousticGuitar = new AcousticGuitar();
        acousticGuitar.strum();
        acousticGuitar.pluck();
        acousticGuitar.tune();
        System.out.println("================================");

        AugustSmartLock augustSmartLock = new AugustSmartLock();
        augustSmartLock.lock();
        augustSmartLock.unlock();
        augustSmartLock.checkBattery();
        System.out.println("================================");

        AppleWatch appleWatch=new AppleWatch();
        appleWatch.monitorHeartRate();
        appleWatch.showNotifications();
        appleWatch.trackSteps();
        System.out.println("================================");

        BBCNews bbcNews=new BBCNews();
        bbcNews.bookmarkArticle();
        bbcNews.readArticle();
        bbcNews.readArticle();
        System.out.println("================================");

        BoschDishwasher boschDishwasher = new BoschDishwasher();
        boschDishwasher.startWash();
        boschDishwasher.stopWash();
        boschDishwasher.addDetergent();
        System.out.println("================================");

        BritaWaterFilter britaWaterFilter = new BritaWaterFilter();
        britaWaterFilter.filterWater();
        britaWaterFilter.changeFilter();
        britaWaterFilter.checkWaterQuality();
        System.out.println("================================");

        BrevilleElectricKettle brevilleElectricKettle=new BrevilleElectricKettle();
        brevilleElectricKettle.boilWater();
        brevilleElectricKettle.stopBoiling();
        brevilleElectricKettle.stopBoiling();
        System.out.println("================================");

        Circle circle=new Circle();
        circle.area();
        circle.draw();
        circle.perimeter();
        System.out.println("================================");

        CityBus cityBus = new CityBus();
        cityBus.boardPassenger();
        cityBus.startRoute();
        cityBus.stopRoute();
        System.out.println("================================");

        ClawHammer clawHammer = new ClawHammer();
        clawHammer.hammerNail();
        clawHammer.removeNail();
        clawHammer.adjustGrip();
        System.out.println("================================");

        CloudStorage cloudStorage=new CloudStorage();
        cloudStorage.delete();
        cloudStorage.download();
        cloudStorage.upload();
        System.out.println("================================");


        CommercialAirplane commercialAirplane = new CommercialAirplane();
        commercialAirplane.takeOff();
        commercialAirplane.land();
        commercialAirplane.navigate();
        System.out.println("================================");

        Coursera coursera=new Coursera();
        coursera.completeLesson();
        coursera.enrollCourse();
        coursera.takeQuiz();
        System.out.println("================================");

        CreditCard creditCard=new CreditCard();
        creditCard.authorize();
        creditCard.capture();
        creditCard.refund();
        System.out.println("================================");

        CuisinartToaster cuisinartToaster = new CuisinartToaster();
        cuisinartToaster.startToasting();
        cuisinartToaster.eject();
        cuisinartToaster.adjustLevel();
        System.out.println("================================");

        DeliveryDrone deliveryDrone=new DeliveryDrone();
        deliveryDrone.captureVideo();
        deliveryDrone.land();
        deliveryDrone.takeOff();
        System.out.println("================================");

        DigitalClock digitalClock=new DigitalClock();
        digitalClock.setAlarm();
        digitalClock.showTime();
        digitalClock.stopAlarm();
        System.out.println("================================");

        DineInRestaurant dineInRestaurant=new DineInRestaurant();
        dineInRestaurant.billCustomer();
        dineInRestaurant.serveFood();
        dineInRestaurant.takeOrder();
        System.out.println("================================");

        DSLR dslr=new DSLR();
        dslr.capture();
        dslr.record();
        dslr.zoom();
        System.out.println("================================");

        DysonFan dysonFan = new DysonFan();
        dysonFan.turnOn();
        dysonFan.turnOff();
        dysonFan.adjustSpeed();
        System.out.println("================================");

        DysonVacuumCleaner dysonVacuumCleaner = new DysonVacuumCleaner();
        dysonVacuumCleaner.start();
        dysonVacuumCleaner.stop();
        dysonVacuumCleaner.adjustPower();
        System.out.println("================================");

        EcobeeSmartThermostat ecobeeSmartThermostat = new EcobeeSmartThermostat();
        ecobeeSmartThermostat.adjustTemperature();
        ecobeeSmartThermostat.turnOff();
        ecobeeSmartThermostat.programSchedule();
        System.out.println("================================");

        EmailNotification emailNotification=new EmailNotification();
        emailNotification.cancelNotification();
        emailNotification.scheduleNotification();
        emailNotification.sendNotification();
        System.out.println("================================");

        EpsonScanner epsonScanner = new EpsonScanner();
        epsonScanner.scanDocument();
        epsonScanner.clearScan();
        epsonScanner.save();
        System.out.println("================================");

        Fitbit fitbit=new Fitbit();
        fitbit.logWorkout();
        fitbit.setGoal();
        fitbit.setGoal();
        System.out.println("================================");

        FitbitFitnessTracker fitbitFitnessTracker = new FitbitFitnessTracker();
        fitbitFitnessTracker.trackSteps();
        fitbitFitnessTracker.monitorHeartRate();
        fitbitFitnessTracker.setGoals();
        System.out.println("================================");

        FreightTruck freightTruck = new FreightTruck();
        freightTruck.loadCargo();
        freightTruck.unloadCargo();
        freightTruck.startEngine();
        System.out.println("================================");

        GardenShovel gardenShovel = new GardenShovel();
        gardenShovel.dig();
        gardenShovel.moveDirt();
        gardenShovel.emptyShovel();
        System.out.println("================================");

        GeorgeForemanGrill georgeForemanGrill = new GeorgeForemanGrill();
        georgeForemanGrill.heatUp();
        georgeForemanGrill.cookFood();
        georgeForemanGrill.clean();
        System.out.println("================================");

        GoogleAssistant googleAssistant=new GoogleAssistant();
        googleAssistant.answerQuestion();
        googleAssistant.makeCall();
        googleAssistant.setReminder();
        System.out.println("================================");

        GrandPiano grandPiano = new GrandPiano();
        grandPiano.playNote();
        grandPiano.stopNote();
        grandPiano.adjustVolume();
        System.out.println("================================");

        HarleyDavidson harleyDavidson = new HarleyDavidson();
        harleyDavidson.startEngine();
        harleyDavidson.accelerate();
        harleyDavidson.brake();
        System.out.println("================================");

        HPPrinterScanner hpPrinterScanner = new HPPrinterScanner();
        hpPrinterScanner.scanDocument();
        hpPrinterScanner.printDocument();
        hpPrinterScanner.copyDocument();
        System.out.println("================================");

        HubbleTelescope hubbleTelescope = new HubbleTelescope();
        hubbleTelescope.focus();
        hubbleTelescope.adjustZoom();
        hubbleTelescope.trackObjects();
        System.out.println("================================");

        Instagram instagram=new Instagram();
        instagram.comment();
        instagram.likePost();
        instagram.postUpdate();
        System.out.println("================================");

        InternationalAirline internationalAirline=new InternationalAirline();
        internationalAirline.boardFlight();
        internationalAirline.bookTicket();
        internationalAirline.checkIn();
        System.out.println("================================");

        KeurigCoffeeMachine keurigCoffeeMachine = new KeurigCoffeeMachine();
        keurigCoffeeMachine.brewCoffee();
        keurigCoffeeMachine.stopBrew();
        keurigCoffeeMachine.setStrength();
        System.out.println("================================");

        LaserPrinter laserPrinter=new LaserPrinter();
        laserPrinter.cancel();
        laserPrinter.print();
        laserPrinter.scan();
        System.out.println("================================");

        LEDTelevision ledTelevision=new LEDTelevision();
        ledTelevision.changeChannel();
        ledTelevision.turnOn();
        ledTelevision.turnOff();
        System.out.println("================================");

        LGFridge lgFridge = new LGFridge();
        lgFridge.cool();
        lgFridge.defrost();
        lgFridge.adjustTemperature();
        System.out.println("================================");

        LuxuryHotel luxuryHotel=new LuxuryHotel();
        luxuryHotel.checkIn();
        luxuryHotel.checkOut();
        luxuryHotel.reserveRoom();
        System.out.println("================================");

        MacBook macBook = new MacBook();
        macBook.bootUp();
        macBook.shutdown();
        macBook.runProgram();
        System.out.println("================================");

        MountainBike mountainBike = new MountainBike();
        mountainBike.pedal();
        mountainBike.brake();
        mountainBike.changeGear();
        System.out.println("================================");

        MySQLDatabase mySQLDatabase=new MySQLDatabase();
        mySQLDatabase.connect();
        mySQLDatabase.disconnect();
        mySQLDatabase.query();
        System.out.println("================================");

        NestSmokeDetector nestSmokeDetector = new NestSmokeDetector();
        nestSmokeDetector.detectSmoke();
        nestSmokeDetector.alert();
        nestSmokeDetector.test();
        System.out.println("================================");

        NestThermostat nestThermostat = new NestThermostat();
        nestThermostat.increaseTemperature();
        nestThermostat.decreaseTemperature();
        nestThermostat.setTimer();
        System.out.println("================================");

        Netflix netflix=new Netflix();
        netflix.pauseContent();
        netflix.playContent();
        netflix.stopContent();
        System.out.println("================================");

        NutriBulletBlender nutriBulletBlender = new NutriBulletBlender();
        nutriBulletBlender.blend();
        nutriBulletBlender.stop();
        nutriBulletBlender.adjustSpeed();
        System.out.println("================================");

        PhilipsAlarmClock philipsAlarmClock = new PhilipsAlarmClock();
        philipsAlarmClock.setAlarm();
        philipsAlarmClock.snooze();
        philipsAlarmClock.stopAlarm();
        System.out.println("================================");

        PhilipsLamp philipsLamp = new PhilipsLamp();
        philipsLamp.turnOn();
        philipsLamp.turnOff();
        philipsLamp.adjustBrightness();
        System.out.println("================================");

        PlayStation playStation=new PlayStation();
        playStation.playGame();
        playStation.loadGame();
        playStation.saveGame();
        System.out.println("================================");

        Refrigerator refrigerator=new Refrigerator();
        refrigerator.reset();
        refrigerator.turnOn();
        refrigerator.turnOff();
        System.out.println("================================");

        SamsungMicrowave samsungMicrowave = new SamsungMicrowave();
        samsungMicrowave.start();
        samsungMicrowave.stop();
        samsungMicrowave.setTimer();
        System.out.println("================================");

        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.checkBalance();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        System.out.println("================================");

        ScientificCalculator scientificCalculator=new ScientificCalculator();
        scientificCalculator.add();
        scientificCalculator.multiply();
        scientificCalculator.subtract();
        System.out.println("================================");

        SamsungTV samsungTV = new SamsungTV();
        samsungTV.turnOn();
        samsungTV.turnOff();
        samsungTV.changeChannel();
        System.out.println("================================");

        Smartphone smartphone=new Smartphone();
        smartphone.powerOff();
        smartphone.powerOn();
        smartphone.restart();
        System.out.println("================================");

        Sedan sedan = new Sedan();
        sedan.start();
        sedan.stop();
        sedan.accelerate();
        System.out.println("================================");

        SonyRemote sonyRemote = new SonyRemote();
        sonyRemote.powerOn();
        sonyRemote.changeChannel();
        sonyRemote.adjustVolume();
        System.out.println("================================");

        StradivariusViolin stradivariusViolin = new StradivariusViolin();
        stradivariusViolin.bowString();
        stradivariusViolin.stopSound();
        stradivariusViolin.adjustTuning();
        System.out.println("================================");

        SunPowerSolarPanel sunPowerSolarPanel = new SunPowerSolarPanel();
        sunPowerSolarPanel.generatePower();
        sunPowerSolarPanel.storeEnergy();
        sunPowerSolarPanel.monitorEfficiency();
        System.out.println("================================");

        TeslaModelS teslaModelS = new TeslaModelS();
        teslaModelS.chargeBattery();
        teslaModelS.startDrive();
        teslaModelS.stopDrive();
        System.out.println("================================");

        Uber uber=new Uber();
        uber.bookRide();
        uber.endRide();
        uber.startRide();
        System.out.println("================================");

        WhirlpoolWashingMachine whirlpoolWashingMachine = new WhirlpoolWashingMachine();
        whirlpoolWashingMachine.startCycle();
        whirlpoolWashingMachine.stopCycle();
        whirlpoolWashingMachine.addDetergent();
        System.out.println("================================");

        ZojirushiRiceCooker zojirushiRiceCooker = new ZojirushiRiceCooker();
        zojirushiRiceCooker.cookRice();
        zojirushiRiceCooker.keepWarm();
        zojirushiRiceCooker.turnOff();
        System.out.println("================================");
    }
    }
