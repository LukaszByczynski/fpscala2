package me.scf37.fpscala2.config

case class DbConfig(
  url: String,
  user: String,
  password: String,
  minPoolSize: Int,
  maxPoolSize: Int
)
