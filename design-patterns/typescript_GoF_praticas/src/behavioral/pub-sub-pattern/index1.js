class PubSub {
    constructor() {
      this.subscribers = {};
    }
  
    subscribe(event, fn) {
      if (Array.isArray(this.subscribers[event])) {
        this.subscribers[event] = [...this.subscribers[event], fn];
      } else {
        this.subscribers[event] = [fn];
      }
      return () => {
        this.unsubscribe(event, fn);
      };
    }
  
    unsubscribe(event, fn) {
      this.subscribers[event] = this.subscribers[event].filter(
        (sub) => sub !== fn
      );
    }
  
    publish(event, data) {
      if (Array.isArray(this.subscribers[event])) {
        this.subscribers[event].forEach((sub) => {
          sub(data);
        });
      }
      return false;
    }
  }
  
  export default new PubSub();