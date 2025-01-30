//Museum Heist

import java.util.Scanner;
public class MuseumHeist{ 
  static Scanner userInput = new Scanner(System.in);
  static String[] roomNames = {"Entrance Hall", "Painting Gallery", "Sculpture Room", "Gift Shop", "Artifact Room"};
  
  public static void main(String[] args){
    if(args.length > 0 && args[0].equals("-help")) {
      helpMenu();
    }
    else {
    mainMenu();
    }
  }
  
  public static void helpMenu() {
    System.out.println("\t ~Help Menu~");
    System.out.println("Mission: Your goal is to explore each room and find the numbers needed\n" + "to unlock the door to the artifact room and steal the artifact.");
    System.out.println("Controls:\n It's very simple! After you input a number designated to the dispalyed option press the enter key to move to the next prompt!");
  }
  public static void mainMenu() {
    final String MENU = 
    "\t HEIST FOR THE GOLDEN SCARAB\n" +
    "(1)Start Heist\n" +
    "(2)Exit";

    System.out.println(MENU);
    int menuAction = userInput.nextInt();
    switch (menuAction){
      case 1:
        entranceHall();
        break;
      default:
        System.exit(0);
    }
  }

  //Movement Method 
  public static void movement(){
    int movements = userInput.nextInt();
    
    switch(movements){
      case 0:
        entranceHall();
        break;
      case 1:
        System.out.println(roomNames[1]);
        paintingGallery();
        break;
      case 2:
        System.out.println(roomNames[2]);
        sculptureRoom();  
        break;
      case 3:
        System.out.println(roomNames[3]);
        giftShop();
        break;
      case 4:
        System.out.println(roomNames[4]);
        artifactRoom();
        break;
      default:
        System.out.println("Error wrong input. Please input one of the numbers listed.");
        movement();
        break;
    }
  }

  //Room Methods
  public static void entranceHall(){
    System.out.println();
    System.out.println(roomNames[0]);
    System.out.println("> (1) Observe\n" + "> (2) Switch Rooms");
    System.out.println(" ");
    int roomAction = userInput.nextInt();
    
    if (roomAction == 1) {
      System.out.println("> You observe the room.\n" + "> A few feet in front of you there is a large reception table with a sign hanging above.\n" + "> The sign reads, \"Entrance Hall\". To the left, right and back of the reception table there are four corridors.\n" + "> Each with with a sign that reads \"Painting Gallery\", \"Sculpture Room\", \"Gift Shop\", \"Artifact Room\"." );
    
      System.out.println(" ");
      while (roomAction == 1) {
        System.out.println("> (0) Go back to options.");
        int secondRoomAction = userInput.nextInt();
        if (secondRoomAction == 0) {
          entranceHall();
          break;
        }
      }
    }
      
    else if (roomAction == 2){
      System.out.println("> Which room do you want to go to next?\n" + "> (1) Painting Gallery\n> (2) Sculpture Room\n> (3) Gift Shop\n> (4) Artifact Room");
      movement();
    }
      
    else{
      System.out.println("Error wrong input. Please input one of the numbers listed.");
      entranceHall();
    }
  }

  public static void paintingGallery(){
    System.out.println();
    System.out.println("You've entered the painting gallery. What's your next move?");
    System.out.println("> (1) Observe\n" + "> (2) Switch Rooms");
    int roomAction = userInput.nextInt();
    
    if (roomAction == 1){
      System.out.println("> You observe the room\n" + "The gallery is scattered with many famous paintings. You notice three paintings with the museum light illuminated on them.\n");
      paintingsObserved();
    }
        
    else if (roomAction == 2){
      System.out.println("Which room do you want to go to next?\n> (0) Entrance Hall\n> (2) Sculpture Room\n> (3) Gift Shop\n> (4) Artifact Room");
      movement();  
    }
    
    else{
        System.out.println("Error wrong input. Please input one of the numbers listed.");
        paintingGallery();
    }
  }

  public static void paintingsObserved(){
    System.out.println();
    int painting = 1;
    while (painting > 0 && painting < 4) {
      System.out.println("Which painting do you want to see?\n> (1) Painting of Castle\n> (2) Painting of Cabin\n> (3) Painting of Cityscape\n> (4) Back to Menu\n");   
      painting = userInput.nextInt();
      switch (painting){
        case 1: 
          paintingOne();
          break;
        case 2:
          paintingTwo();
          break;
        case 3:
          paintingThree();
          break;
        case 4:
          paintingGallery();
          break;
        default:
          System.out.println("Error wrong input. Please input one of the numbers listed.");
          break;
      }
    }
  }
  

  public static void sculptureRoom(){
    System.out.println("You're at the sculpture room. What's your next move?");
    System.out.println("> (1) Observe\n" + "> (2) Switch Rooms");
    int roomAction = userInput.nextInt();
    
    if (roomAction == 1){
      System.out.println(sculptureOne());
      System.out.println("> You observe the room\n" + "There is one scuplture that stands out from the others. You decide to take a closer look at it.\n" + "Upon further inspection you notice a number written on its stomach. The number is 2.");
      System.out.println(" ");
      
      while (roomAction == 1) {
        System.out.println("> (0) Go back to options.");
        int secondRoomAction = userInput.nextInt();
        if (secondRoomAction == 0) {
          sculptureRoom();
          break;
        }
      }
    }
      
    else if (roomAction == 2){
      System.out.println("> Which room do you want to go to next?\n> (0) Entrance Hall\n> (1) Painting Gallery\n> (3) Gift Shop\n> (4) Artifact Room");
      movement();
    }
      
    else{
      System.out.println("Error wrong input. Please input one of the numbers listed.");
      sculptureRoom();
    }
  }

  public static void giftShop(){
    System.out.println();
    System.out.println("You're at the gift shop. What's your next move?");
    System.out.println("> (1) Observe\n" + "> (2) Switch Rooms");
    int roomAction = userInput.nextInt();
    
    if (roomAction == 1){
      System.out.println("> You observe the room\n" + "The gift shop is riddled with mini-figurines, toys, sweets, magazines and clothes. You decide to take a look at the bargain bin.\n" + "There are four items in the bargain bin: a boat, a clock, a teddy bear, and a castle.\n");
      
      System.out.println(" ");
      int choice = 1;
      while (choice > 0 && choice < 6) {
        System.out.println("Choose an item to view: \n> (1) A Boat\n> (2) A Clock\n> (3) A Teddy Bear\n> (4) A Castle\n> (5) Back to Menu\n");
        choice = userInput.nextInt();
          switch(choice){
            case 1:
              System.out.println(boatItem());
              break;
            case 2:
              System.out.println(clockItem());
              break;
            case 3:
              System.out.println(teddyBearItem());
              break;
            case 4:
              System.out.println(castleItem());
              break;
            case 5:
              giftShop();
              break;
        }
      }
    }
      
    else if (roomAction == 2){
      System.out.println("Which room do you want to go to next?\n> (0) Entrance Hall\n> (1) Painting Gallery\n> (2) Sculpture Room\n> (4) Artifact Room");
      movement();
    }
      
    else{
      System.out.println("Error wrong input. Please input one of the numbers listed.");
      giftShop();
    }
  }

  public static void artifactRoom(){
    System.out.println();
    System.out.println("You're at the artifact room. What's your next move?");
    System.out.println("> (1) Observe\n" + "> (2) Switch Rooms\n");
    int roomAction = userInput.nextInt();
    
    if (roomAction == 1){
      System.out.println("> You observe the room\n");
      System.out.println("The room has a paper taped in front of the door with a number pad right next to it. the paper says:\n" + "Did you forget the code again Brian?! Remember there are six numbers in the code. You'll find the first three numbers in the painting room. One number will be in the sculpture room.\nThe last two numbers should be in the gift shop,\nthe number should be the number of items on the paintings in the gallery.\n");
      
      while (roomAction == 1) {
        System.out.println("> (0) Input Code in number pad.\n> (2) Go back to options.");
        int secondRoomAction = userInput.nextInt();
        
        if (secondRoomAction == 0) {
          System.out.println("> You decide to input the code");
          userInput.nextLine();
          String code = userInput.nextLine();
          String finalCode = "343285";


          if (code.equals(finalCode)){
            System.out.println(goodEnding());
            endingGood();
          }
          else{
            System.out.println(badEnding());
            endingBad();
            
          }
        }
          
        else if (secondRoomAction == 2){
            artifactRoom();
            break;
        }

        else{
          System.out.println("Error wrong input. Please input one of the numbers listed."); 
        }
      }
    }
      
    else if (roomAction == 2){
      System.out.println("Which room do you want to go to next?\n" + "> 0.Entrance Hall\n > 1.Painting Gallery\n > 2.Sculpture Room\n > 3.Gift Shop");
      movement();
    }
      
    else{
      System.out.println("Error wrong input. Please input one of the numbers listed.");
      artifactRoom();
    }
  }


  //Painting Methods
  public static void paintingOne(){
    System.out.println("This painting shows a castle with three tall towers each with a flag on top.");
    final String CASTLE = 
    "                        |>>>\n" +
        "                        |\n" + 
        "           |>>>      _  |_  _         |>>>\n" +
        "           |        |;| |;| |;|       |\n" +
        "       _  _|_  _    \\.    .  /    _  _|_  _\n" +
        "      |;|_|;|_|;|    \\:. ,  /    |;|_|;|_|;|\n" +
        "      \\..      /    ||;   . |     \\.    .  /\n" +
        "       \\.  ,  /     ||:  .  |      \\:  .  /\n" +
        "        ||:   |_   _ ||_ . _ | _   _||:   |\n" +
        "        ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |\n" +
        "        ||:   ||.    .     .      . ||:  .|\n" +
        "        ||: . || .     . .   .  ,   ||:   |       \\,/\n" +
        "        ||:   ||:  ,  _______   .   ||: , |            \\/`\\ \n" +
        "        ||:   || .   /+++++++\\    . ||:   |\n" +
        "        ||:   ||.    |+++++++| .    ||: . |\n" +
        "     __ ||: . ||: ,  |+++++++|.  . _||_   |\n" +
    "____--`~    '--~~__|.|+++++__|----~    ~`---,              ___\n" +
"-~--~                  ~---__|,--~'                  ~~----_____-~'   `~----~~\n";

    System.out.println(CASTLE);
    //call method
  }

  public static void paintingTwo(){
    System.out.println("This painting shows a little cabin in the snow with four very tall and snowy mountain peaks behind it.");
    final String MOUNTAIN = 
    "                            /\\ \n" +
        "                       /\\  //\\\\\n" +
        "                /\\    //\\\\///\\\\\\        /\\\n" +
        "               //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\n" +
        "  /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\ \n" +
        " / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\n" +
       "/^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\            *\n" +
      "/  ^ ^\\/^  ^\\ ^ ^ ^   ^  ^   ^       ____^   ^  \\        /|\\\n" +
     "/ ^ ^  ^ \\ ^    _\\___________________|  |_____^ ^  \\    /||o\\\n" +
    "/ ^^  ^ ^ ^\\    /______________________________\\ ^ ^ \\ /|o|||\\\n" +
   "/  ^  ^^ ^ ^   /________________________________\\  ^  /|||||o|\\\n" +
  "/^ ^  ^ ^^  ^    ||___|___||||||||||||___|__|||      /||o||||||\\       |\n" +
 "/ ^   ^   ^    ^ ||___|___||||||||||||___|__|||          | |           |\n" +
"/ ^ ^ ^  ^  ^  ^ ||||||||||||||||||||||||||||||oooooooooo| |ooooooo  |\n" +
"ooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n";
    System.out.println(MOUNTAIN);
    // call method
  }

  public static void paintingThree(){
    System.out.println("This painting shows a city late at night with many fireworks lighting up the night sky. There are also 3 boats on the lake below the cityscape.");
    final String CITY = 
                "                                   .''.\n" +
                "       .''.      .        *''*    :_\\/_:     .\n" +
                "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ :    /)\\   ':'* /\\ *  : '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_'.':'.'\n" +
                " : /\\ : :::::  =  *_\\/_*     -= o =- /)\\    '  *\n" +
                "  '..'  ':::' === * /\\ *     .'/.\\'.  ' ._____\n" +
                "      *        |   *..*         :       |.   |' .---\"|\n" +
                "        *      |     _           .--'|  ||   | _|    |\n" +
                "        *      |  .-'|       __  |   |  |    ||      |\n" +
                "     .-----.   |  |' |  ||  |  | |   |  |    ||      |\n" +
                " ___'       ' /\"\\ |  '-.\"\".    '-'   '-.'    '`      |____\n" +
                "   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "                       ~-~-~-~-~-~-~-~-~-~   /|\n" +
                "          )      ~-~-~-~-~-~-~-~  /|~       /_|\\\n" + 
                "        _-H-__  -~-~-~-~-~-~     /_|\\    -~======-~\n" +
                "~-\\XXXXXXXXXX/~     ~-~-~-~     /__|_\\ ~-~-~-~\n" +
                "~-~-~-~-~-~    ~-~~-~-~-~-~    ========  ~-~-~-~\n";
    System.out.println(CITY);
    //call method
  }
  public static String sculptureOne(){
    final String SCULPTURE = 
                "    %%%\n" +
                "   =====\n" +
                "  &%&%%%&\n" +
                "  %& < <% \n" +
                "   &\\__/\n" +
                "    \\ |____\n" +
                "   .', ,  ()\n" +
                "  / -.  _)| \n" +
                " |_(_.    |\n" +
                " '-'\\  )  |\n" +
                "     )   2 |\n" +
                "    /  .  ).\n" +
                "   /    _. |\n" +
                " /'---':.-'|\n" +
                "(__.' /    /\n" +
                " \\   ( /  /\n" +
                "  \\ /  _  |\n" +
                "   \\  |  '| \n" +
                "   | . \\  |\n" +
                "   |(     | \n" +
                "   | . \\  |\n" +
                "   |(     | \n" +
                "   |  \\ \\ |\n" +
                "    \\  )\\ |\n" +
                "   __)/ / \\\n" +
                "--\"--(_.Ooo'----\n";
    return SCULPTURE;
  }

  public static String boatItem(){
    final String GIFT1 = 
                "             /|~~~   \n" +
                "           ///|      \n" +
                "         /////|      \n" +
                "       ///////|      \n" +
                "     /////////|      \n" +
                "   \\==========|===/  \n" +
                "~~~~~~~~~~~~~~~~~~~~~\n" +
                "        /  \n" +
                "       /\\\n" +
                "    [$5.00] \n";
    return GIFT1;
  }

  public static String castleItem(){
    final String GIFT2 = 
                " [][][] /--\\ [][][]\n" +
                "  |::| /____\\ |::|\n" +
                "  |[]|_|::::|_|[]|\n" +
                "  |::::::__::::::|\n" +
                "  |:::::/||\\:::::|\n" +
                "  |:#:::||||::#::|\n" +
                " #%*###&*##&*&#*&##\n" +
                "##%%*####*%%%###*%*#\n" +
                "        /  \n" +
                "       /\\\n" +
                "    [$8.00] \n";
    return GIFT2;
  }
  
  public static String clockItem(){
    final String GIFT4 =
                "          _\n" +
                "        ,/_\\, \n" +
                "      ,/_/ \\_\\,\n" +
                "     /_/ ___ \\_\\\n" +
                "    /_/ |(V)| \\_\\\n" +
                "      |  .-.  |\n" +
                "      | / / \\ |\n" +
                "      | \\ \\ / |\n" +
                "      |  '-'  |\n" +
                "      '--,-,--'\n" +
                "         | |\n" +
                "         | |\n" +
                "         | |\n" +
                "         /\\|\n" +
                "         \\/|\n" +
                "          /\\\n" +
                "          \\/\n" +
                "          /  \n" +
                "         /\\\n" +
                "     [$20.00] \n";
    return GIFT4;
  }

  public static String teddyBearItem(){
    final String GIFT3 =
                " {\"'-'\"}\n" +
                "  (o o)\n" +
                "  ,`Y'.\n" +
                " / ,-. \\\n" +
                "(_)| |(_)\n" +
                "  /`_'\\\n" +
                " (_) (_)\n" +
                "     /  \n" +
                "    /\\\n" +
                "[$10.00] \n";
    return GIFT3;
  }

  public static String goodEnding(){
    final String GOODENDING = 
                "               *    *\n" +
                "   *         '       *       .  *   '     .           * *\n" +
                "                                                               '\n" +
                "       *                *'          *          *        '\n" +
                "   .           *               |               /\n" +
                "               '.         |    |      '       |   '     *\n" +
                "                 \\*        \\   \\             /\n" +
                "       '          \\     '* |    |  *        |*                *  *\n" +
                "            *      `.       \\   |     *     /    *      '\n" +
                "  .                  \\      |   \\          /               *\n" +
                "     *'  *     '      \\      \\   '.       |\n" +
                "        -._            `                  /         *\n" +
                "  ' '      ``._   *                           '          .      '\n" +
                "   *           *\\*          * .   .      *\n" +
                "*  '        *    `-._        CONGRATS!!!    .         _..:='        *\n" +
                "             You were succesfully able to steal the artifact.     *    *   \n" +
                "     Now go ahead and wish for whatever treasures you've always wanted.    \n" +
                "   .               '             . '   *           *         .\n" +
                "  *       ___.-=--..-._     *                '               '\n" +
                "                                  *       *\n" +
                "                *        _.'  .'       `.        '  *             *\n" +
                "     *              *_.-'   .'            `.               *\n" +
                "                   .'                       `._             *  '\n" +
                "   '       '                        .       .  `.     .\n" +
                "       .                      *                  `\n" +
                "               *        '             '                          .\n" +
                "     .                          *        .           *  *\n" +
                "             *        .                                    '\n";
    return GOODENDING;
  }

  public static String badEnding(){
    final String BADENDING =
                "                      ________________\n" +
                "                      \\      __      /         __\n" +
                "                       \\_____()_____/         /  )\n" +
                "                       '============`        /  /\n" +
                "                        #---\\  /---#        /  /\n" +
                "                       (# @\\| |/@  #)      /  /\n" +
                "                        \\   (_)   /       /  /\n" +
                "                        |\\ '---` /|      /  /\n" +
                "                _______/  \\_____// \\____/ o_|\n" +
                "               /       \\  /     \\  /   / o_|\n" +
                "              / |           o|        / o_| \\\n" +
                "             /  |  _____     |       / /   \\ \\\n" +
                "            /   |  |===|    o|      / /\\    \\ \\\n" +
                "           |    |   \\@/      |     / /  \\    \\ \\\n" +
                "           |    |___________o|__/----)   \\    \\/\n" +
                "           |    '              ||  --)    \\     |\n" +
                "           |___________________||  --)     \\    /\n" +
                "                |           o|   ''''   |   \\__/\n" +
                "                |            |          |\n" +
                "                                               \n" +
                "You failed at obtaining the artifact and in the process the cops got called.\n" +
                "              You will now be sent to prison for grand larceny.\n" +
                "                          Better luck next life...\n";
    return BADENDING;
  }

  //Ending Methods
  public static void endingGood(){
    System.out.println();
    System.out.println("Good Ending");
    System.out.println("Congrats!! You were succesfully able to steal the artifact. Now go ahead and wish for whatever treasures you've always wanted.");
      System.exit(0);
  }

  public static void endingBad(){
    System.out.println();
    System.out.println("Bad Ending");
    System.out.println("You failed at obtaining the artifact and in the process the cops got called and you will now be sent to prison for grand larceny. Better luck next life...");
    
    System.out.println("Do you wish to go back to the menu screen?\n" + "> (1) Yes\n> (2) No");
    int gameRestart = userInput.nextInt();

    if (gameRestart == 1){
      mainMenu();
    }
    else if (gameRestart == 2){
      System.out.println("Leaving game.");
      System.exit(0);
    }
    else {
      System.out.println("Not one of the options. Taking you back to prompt.");
      endingBad();
    }
  }
}