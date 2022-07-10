import { ProductProtocol } from "./product-protocol";

export class TShirt implements ProductProtocol {
    private name = "camiseta"
    private price = 45
    getPrice(): number {
        return this.price
    }
    getName(): string {
        return this.name
    }
}