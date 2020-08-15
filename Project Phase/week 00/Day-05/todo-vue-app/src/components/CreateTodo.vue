<template>
  <div class="container cont-style">
    <div class="row justify-content-center">
      <div class="col-4 col-style">
        <form class="title-pad">
          <div class="form-group">
            <label for="title">Title</label>
            <input type="text" class="form-control" id="title" v-model="titleTodo" />
          </div>
          <div class="form-group">
            <label for="project">Project</label>
            <input type="text" class="form-control" id="project" v-model="projectTodo" />
          </div>
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-6 button-col-style">
                <button type="button" class="btn btn-primary btn-block" v-on:click="newTodo">Create</button>
              </div>
              <div class="col-6 button-col-style">
                <button type="reset" class="btn btn-danger btn-block">Cancel</button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "CreateTodo",
  data: function () {
    return {
      titleTodo: null,
      projectTodo: null,
    };
  },
  methods: {
    newTodo: function () {
      const newTD = { title: this.titleTodo, project: this.projectTodo, done: false };
      this.$emit("todonew", newTD);
      this.titleTodo = null;
      this.projectTodo = null;
    },
  },
};
</script>
 

<style>
.col-style {
  border-style: solid;
  border-width: 1px;
  border-block-color: black;
  text-align: left;
  padding: 0px;
  padding-top: 10px;
  border-radius: 5px;
}
.button-col-style {
  border-style: none;
  padding: 0px;
}
</style>