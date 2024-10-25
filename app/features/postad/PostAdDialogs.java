package com.forsale.app.features.postad;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostAdDialogs.kt */
/* loaded from: classes2.dex */
public final class PostAdDialogs {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PostAdDialogs[] $VALUES;
    public static final PostAdDialogs UploadSuccess = new PostAdDialogs("UploadSuccess", 0);
    public static final PostAdDialogs UploadWaitingApproval = new PostAdDialogs("UploadWaitingApproval", 1);
    public static final PostAdDialogs UploadMediaFailed = new PostAdDialogs("UploadMediaFailed", 2);
    public static final PostAdDialogs NotEnoughCreditNew = new PostAdDialogs("NotEnoughCreditNew", 3);
    public static final PostAdDialogs NotEnoughCreditForAddonsEdit = new PostAdDialogs("NotEnoughCreditForAddonsEdit", 4);
    public static final PostAdDialogs NotEnoughCreditForAddons = new PostAdDialogs("NotEnoughCreditForAddons", 5);
    public static final PostAdDialogs UpdateApp = new PostAdDialogs("UpdateApp", 6);
    public static final PostAdDialogs GeneralError = new PostAdDialogs("GeneralError", 7);

    private static final /* synthetic */ PostAdDialogs[] $values() {
        return new PostAdDialogs[]{UploadSuccess, UploadWaitingApproval, UploadMediaFailed, NotEnoughCreditNew, NotEnoughCreditForAddonsEdit, NotEnoughCreditForAddons, UpdateApp, GeneralError};
    }

    static {
        PostAdDialogs[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PostAdDialogs(String str, int i11) {
    }

    public static a00.a<PostAdDialogs> getEntries() {
        return $ENTRIES;
    }

    public static PostAdDialogs valueOf(String str) {
        return (PostAdDialogs) Enum.valueOf(PostAdDialogs.class, str);
    }

    public static PostAdDialogs[] values() {
        return (PostAdDialogs[]) $VALUES.clone();
    }
}
