class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake|| prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFreePrisonerWithPetDog =  !archerIsAwake && petDogIsPresent;
        boolean canFreePrisonerWithoutPetDog = !petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake;
        return canFreePrisonerWithPetDog || canFreePrisonerWithoutPetDog;
    }
}
