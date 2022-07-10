import { ProductDecorator } from "./product-decorator";

export class ProductCustomizedDecorator extends ProductDecorator {
    getName(): string {
        return this.product.getName() + " diferente"
    }

    getPrice(): number {
        return this.product.getPrice() + 23
    }
}