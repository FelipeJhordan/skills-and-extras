import { CarFactory } from './factories/car-factory';
import {
  randomCarAlgorithm,
  randomNumbers,
} from './main/random-vehicle-algoritm';

const customersNames = [
  'Ana',
  'Raquel',
  'Matheus',
  'Larissa',
  'Claudio',
  'Deku',
];

for (let i = 0; i < 10; i++) {
  const vehicle = randomCarAlgorithm();
  const name = customersNames[randomNumbers(customersNames.length)];
  vehicle.pickUp(name);
  vehicle.stop();
  console.log('---');
}

const carFactory = new CarFactory();
carFactory.pickUp('Lu', 'Truck');
