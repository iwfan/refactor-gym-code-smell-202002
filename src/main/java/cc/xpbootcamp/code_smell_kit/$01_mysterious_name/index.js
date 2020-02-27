const actions = {
  // 实际表达的是代理服务提供的登录接口
  KaikaiLogin: () => axios.post()
}

new Vue({
  data: () => ({
      onlineTopics: [],
      localTopics: [],
      draftTopics: [],
      addedTopics: [],  // 实际表达的是，新加入下载任务的 Topic
  })
})