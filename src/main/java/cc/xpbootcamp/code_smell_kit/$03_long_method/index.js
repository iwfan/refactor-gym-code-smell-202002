function handleDownload(topic) {
  let isAddedToTopics = false;
  if (this.addedTopics.indexOf(topic.id) >= 0) {
    if (topic.status !== TopicStatus.PENDING) {
      return;
    }
  } else {
    isAddedToTopics = true;
  }

  httpDriver.downloadTopic(topic).then(response => {
    if (isAddedToTopics) {
      this.addedTopics.push(topic.id);
    }
    this.$alert(`${topic.name}已添加至本地下载`, { type: 'success', duration: 5000 });
  }).catch(e => {
    const { error, message } = e.response;
    if (error === 'NoPermission' || error === 'NoEnoughSpace') {
      const dialog = this.$dialog({
        title: '下载失败',
        content: '',
        buttons: {
          confirm: {
            text: '我知道了',
            click: () => {
              dialog.close();
            }
          },
        }
      });
    } else {
      this.$alert('下载失败', { type: 'error', duration: 5000 });
    }
  });

}