<template>
  <div class="container cont-style">
    <div class="row justify-content-center">
      <div class="col-4 col-style" v-if="visible">
        <span class="title-pad">
          <b>{{item.title}}</b>
        </span>
        <p class="title-pad">{{item.project}}</p>
        <div class="right-align">
          <button type="button" class="btn btn-link" v-on:click="itemToDel">
            <svg
              width="1em"
              height="1em"
              viewBox="0 0 16 16"
              class="bi bi-trash-fill"
              fill="currentColor"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                fill-rule="evenodd"
                d="M2.5 1a1 1 0 0 0-1 1v1a1 1 0 0 0 1 1H3v9a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V4h.5a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1H2.5zm3 4a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5zM8 5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7A.5.5 0 0 1 8 5zm3 .5a.5.5 0 0 0-1 0v7a.5.5 0 0 0 1 0v-7z"
              />
            </svg>
          </button>
          <button type="button" class="btn btn-link" v-on:click="visible=false">
            <svg
              width="1em"
              height="1em"
              viewBox="0 0 16 16"
              class="bi bi-pencil-square"
              fill="currentColor"
              xmlns="http://www.w3.org/2000/svg"
            >
              <path
                d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456l-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"
              />
              <path
                fill-rule="evenodd"
                d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"
              />
            </svg>
          </button>
        </div>
        <button v-if="item.done" type="button" class="btn btn-outline-success btn-block">Completed</button>
        <button
          v-else
          type="button"
          class="btn btn-outline-danger btn-block"
          v-on:click="done"
        >Parsing</button>
      </div>

      <div class="col-4 col-style" v-else>
        <form class="title-pad">
          <div class="form-group">
            <label for="title">Title</label>
            <input type="text" class="form-control" id="title" v-model="titleTodo" />
          </div>
          <div class="form-group">
            <label for="project">Project</label>
            <input type="text" class="form-control" id="project" v-model="projectTodo" />
          </div>
          <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="check" v-model="doneTodo" />
            <label class="form-check-label" for="check">ToDo done</label>
          </div>
        </form>
        <button class="btn btn-outline-primary btn-block" v-on:click="editTodo">Close X</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "TodoItem",
  props: ["item"],
  data: function () {
    return {
      visible: true,
      titleTodo: this.item.title,
      projectTodo: this.item.project,
      doneTodo: this.item.done,
    };
  },
  methods: {
    itemToDel: function () {
      this.$emit("itemToDelete", this.item);
    },
    done: function () {
      this.$emit("setDone", this.item);
    },
    editTodo: function () {
      if (this.titleTodo === "") {
        alert("Please set a title to edit Todo");
      } else {
        this.visible = true;
        const newTD = {
          title: this.titleTodo,
          project: this.projectTodo,
          done: this.doneTodo,
        };
        this.$emit("editTD", this.item, newTD);
      }
    },
  },
};
</script>


  


<style>
.cont-style {
  margin-top: 30px;
}
.col-style {
  border-style: solid;
  border-width: 1px;
  border-block-color: black;
  text-align: left;
  padding: 0px;
  padding-top: 10px;
  border-radius: 5px;
}
.title-pad {
  padding-left: 10px;
  padding-right: 10px;
}

.right-align {
  text-align: right;
  padding-right: 10px;
}
</style>