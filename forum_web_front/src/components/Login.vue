<template>
  <div class="login-panel">
    <a-form
      id="components-form-demo-normal-login"
      :form="form"
      class="login-form"
      @submit="handleSubmit"
    >
      <a-form-item>
        <h1>海角</h1>
        <a-input
          v-decorator="[
            'account',
            { rules: [{ required: true, message: '请输入用户名!' }] }
          ]"
          placeholder="请输入用户名"
        >
          <a-icon slot="prefix" type="user" style="color: rgba(0,0,0,.25)" />
        </a-input>
      </a-form-item>
      <a-form-item>
        <a-input
          v-decorator="[
            'password',
            { rules: [{ required: true, message: '请输入密码' }] }
          ]"
          type="password"
          placeholder="请输入密码"
          style="margin-top:30px"
        >
          <a-icon slot="prefix" type="lock" style="color: rgba(0,0,0,.25)" />
        </a-input>
      </a-form-item>
      <a-form-item>
        <a-button type="primary" html-type="submit" class="login-form-button" :loading="loading"
        style="margin-top:30px">
          登录
        </a-button>
      </a-form-item>
    </a-form>
  </div>
</template>
<script>
export default {
  name: 'login',
  data() {
    return {
      saltobj: {},
      loading: false,
    };
  },
  create() {},
  methods: {
    handleSubmit(e) {
      e.preventDefault();
    },
  },
};
</script>
<style lang="less" scoped>
.login-panel {
  height: 930px;
  background: url('../assets/index.jpg') no-repeat center;
  background-size: cover;
  .login-form {
    border-radius: 5px;
    max-width: 400px;
    padding: 20px;
    background-color: rgba(255, 255, 255, 0.9);
    position: relative;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
  }
}
</style>
