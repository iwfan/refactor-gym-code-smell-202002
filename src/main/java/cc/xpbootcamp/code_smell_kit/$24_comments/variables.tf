# replicated using sync_storage_account
variable "dead_letter_reporter_storage_account" {
  type = object({
    name                           = string
    primary_blob_connection_string = string
  })
}

#Replicated using offset_storage_container
variable "dead_letter_reporter_storage_container" {
  type = object({
    name = string
  })
}