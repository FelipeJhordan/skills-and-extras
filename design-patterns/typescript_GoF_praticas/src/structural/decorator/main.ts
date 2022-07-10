import { ProductCustomizedDecorator } from "./product/product-customized-decorator";
import { ProductStampDecorator } from "./product/product-stamp-decorator";
import { TShirt } from "./product/t-shirt";

const tShirt = new TShirt()
const tShirtWithStamp = new ProductStampDecorator(tShirt)
const tShirtWithStampFrontAndBack = new ProductStampDecorator(tShirtWithStamp)
const customizedTshirt = new ProductCustomizedDecorator(tShirtWithStampFrontAndBack)

console.log(tShirt.getPrice())
console.log(tShirtWithStamp.getPrice())
console.log(tShirtWithStampFrontAndBack.getPrice())
console.log(customizedTshirt.getName())