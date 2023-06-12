import { registerApplication, start, LifeCycles } from "single-spa";



registerApplication({
  name: "@jhordan/navbar",
  app: () => System.import<LifeCycles>("@jhordan/navbar"),
  activeWhen: () => true
});
registerApplication({
  name: "@jhordan/app1",
  app: () => System.import<LifeCycles>("@jhordan/app1"),
  activeWhen: ["/app1"],
});
registerApplication({
  name: "@jhordan/app2",
  app: () => System.import<LifeCycles>("@jhordan/app2"),
  activeWhen: ["/app2"],
});
start({ urlRerouteOnly: true, });
