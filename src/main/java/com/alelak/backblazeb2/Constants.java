package com.alelak.backblazeb2;

public class Constants {
    public static final String B2_API_VERSION = "/b2api/v1/";
    public static final String AUTHORIZATION_URL = "https://api.backblaze.com/b2api/v1/b2_authorize_account";
    public static final String CREATE_BUCKET_URL = B2_API_VERSION + "b2_create_bucket";
    public static final String UPDATE_BUCKET_URL = B2_API_VERSION + "b2_update_bucket";
    public static final String DELETE_BUCKET_URL = B2_API_VERSION + "b2_delete_bucket";
    public static final String GET_UPLOAD_URL = B2_API_VERSION + "b2_get_upload_url";
    public static final String GET_BUCKETS_URL = B2_API_VERSION + "b2_list_buckets";
    public static final String DELETE_FILE_VERSION_URL = B2_API_VERSION + "b2_delete_file_version";
    public static final String GET_FILE_INFO_URL = B2_API_VERSION + "b2_get_file_info";
    public static final String HIDE_FILE_URL = B2_API_VERSION + "b2_hide_file";
    public static final String GET_LIST_FILE_NAMES = B2_API_VERSION + "b2_list_file_names";
    public static final String GET_LIST_FILE_VERSIONS = B2_API_VERSION + "b2_list_file_names";
    public static final String DOWNLOAD_FILE_BY_ID = B2_API_VERSION + "b2_download_file_by_id";
}
