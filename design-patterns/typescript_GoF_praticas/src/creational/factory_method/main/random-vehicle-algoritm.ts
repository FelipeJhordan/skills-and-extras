import { BicycleFactory } from '../factories/bicycle-factory';
import { CarFactory } from '../factories/car-factory';
import { Vehicle } from '../vehicle/vehicle';

export function randomNumbers(length: number): number {
  return Math.floor(Math.random() * length);
}

export function randomCarAlgorithm(): Vehicle {
  const carFactory = new CarFactory();
  const bicycleFactory = new BicycleFactory();

  const car1 = carFactory.getVehicle('Fusca');
  const car2 = carFactory.getVehicle('Celta Preto');
  const bicycle = bicycleFactory.getVehicle('Monark');

  const cars = [car1, car2, bicycle];

  return cars[randomNumbers(cars.length)];
}
