const knightIsAwake = true;
const archerIsAwake = true;
const prisonerIsAwake =false;
const petDogIsPresent = false; 
export function canExecuteFastAttack(knightIsAwake) {
  return knightIsAwake==true?false:true;
}

export function canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake) {
  return knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true ? true: knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==false?false:true;
}
export function canSignalPrisoner(archerIsAwake, prisonerIsAwake) {
  return archerIsAwake==false && prisonerIsAwake==true?true:false;
}

export function canFreePrisoner(
  knightIsAwake,
  archerIsAwake,
  prisonerIsAwake,
  petDogIsPresent,
) {
   return knightIsAwake==false && archerIsAwake==true && prisonerIsAwake==false && petDogIsPresent==false? false: knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==false && petDogIsPresent==true?true: knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent==false ? true: knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent ==true ? true: knightIsAwake==false && archerIsAwake==true && prisonerIsAwake==false && petDogIsPresent==false?false: knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==false && petDogIsPresent==false?false: knightIsAwake==true && archerIsAwake==false && prisonerIsAwake==false && petDogIsPresent==true?true: knightIsAwake==true && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent==true?true:false;
}
