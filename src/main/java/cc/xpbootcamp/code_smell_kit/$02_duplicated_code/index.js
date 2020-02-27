const actions = {
  //online
  getTopics: (currentPage, pageSize) => axios.get(topicUrlBuilder({
    currentPage,
    pageSize
  }), bffConfigBuilder({
    accessToken: getStore('accessToken'),
    clientId: getStore('clientId'),
    tenantId: getStore('tenantId'),
  })),
  getDraftTopics: (currentPage, pageSize) => axios.get(topicUrlBuilder({
    currentPage,
    pageSize,
    isDraft: true
  }), bffConfigBuilder({
    accessToken: getStore('accessToken'),
    clientId: getStore('clientId'),
    tenantId: getStore('tenantId'),
  })),
}