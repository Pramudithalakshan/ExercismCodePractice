class AnnalynsInfiltration {
    boolean knightIsAwake = true;
    boolean archerIsAwake =true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake==true?false:true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake==true && archerIsAwake==false && prisonerIsAwake==false? true:knightIsAwake==false && archerIsAwake==true && prisonerIsAwake==false?true:knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true?true:knightIsAwake==false && archerIsAwake==true && prisonerIsAwake==true?true:knightIsAwake==true && archerIsAwake==false && prisonerIsAwake==true?true:knightIsAwake==true && archerIsAwake==true && prisonerIsAwake==false?true:knightIsAwake==true && archerIsAwake==true && prisonerIsAwake==true?true:false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return archerIsAwake==false && prisonerIsAwake==true?true: archerIsAwake==true && prisonerIsAwake==false?false:archerIsAwake==false && prisonerIsAwake==false?false:false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
          return knightIsAwake==true && archerIsAwake==true && prisonerIsAwake==true && petDogIsPresent==true?false:   knightIsAwake==false && archerIsAwake==true && prisonerIsAwake==true && petDogIsPresent==true?false:  knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent==true?true:  knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==false && petDogIsPresent==true?true:  knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent==false?true:  knightIsAwake==true && archerIsAwake==false && prisonerIsAwake==false && petDogIsPresent==true?true: knightIsAwake==true && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent==true?true:false; 

    }
}
