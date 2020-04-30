import Vue from 'vue';
import {
  Form,
  Button,
  DatePicker,
  Input,
  Icon,
} from 'ant-design-vue';
import App from './App.vue';
import router from './router';
import store from './store';

Vue.component(Button.name, Button);
Vue.component(DatePicker.name, DatePicker);
Vue.component(Form.name, Form);
Vue.component(Input.name, Input);
Vue.component(Icon.name, Icon);
Vue.config.productionTip = false;

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount('#app');
