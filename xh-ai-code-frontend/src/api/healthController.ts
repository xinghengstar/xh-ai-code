// @ts-ignore
/* eslint-disable */
import request from '@/request'

/** 此处后端没有提供注释 GET /health1/check */
export async function checkHeath(options?: { [key: string]: any }) {
  return request<API.BaseResponseString>('/health1/check', {
    method: 'GET',
    ...(options || {}),
  })
}
