
const PREPARATION_MINUTES_PER_LAYER = 2;
export const EXPECTED_MINUTES_IN_OVEN = 40;
let actualMinutesInOven = 30;
let numberOfLayers =  2;
export function remainingMinutesInOven(actualMinutesInOven) {
 return EXPECTED_MINUTES_IN_OVEN-actualMinutesInOven;
}
export function preparationTimeInMinutes(numberOfLayers) {
  return PREPARATION_MINUTES_PER_LAYER*numberOfLayers;
}
export function totalTimeInMinutes(numberOfLayers, actualMinutesInOven) {
  let time = (numberOfLayers*PREPARATION_MINUTES_PER_LAYER)+actualMinutesInOven;
  return time;
}
