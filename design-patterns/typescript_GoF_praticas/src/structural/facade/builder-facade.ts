import { MainDishBuilder } from './builder/classes/main-dish-builder';
export class BuilderFacade {

private  mainDishBuilder = new MainDishBuilder();

public makeMeal1() {
    this.mainDishBuilder.makeMeal().makeDessert();
    console.log(this.mainDishBuilder.getMeal())
    console.log(this.mainDishBuilder.getPrice())
}



}