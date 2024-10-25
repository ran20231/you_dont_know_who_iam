package com.forsale.app.datalayer.network.responses;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import up.c;
/* compiled from: ImagesAndOneVideoUploadResponse.kt */
@Serializable
/* loaded from: classes2.dex */
public final class ImagesAndOneVideoUploadResponse {
    @c("image_failure_count")
    private final int imageFailureCount;
    @c("image_success_count")
    private final int imageSuccessCount;
    @c("images")
    private final List<String> images;
    @c("video")
    private final Video video;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* compiled from: ImagesAndOneVideoUploadResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ImagesAndOneVideoUploadResponse> serializer() {
            return ImagesAndOneVideoUploadResponse$$serializer.INSTANCE;
        }
    }

    /* compiled from: ImagesAndOneVideoUploadResponse.kt */
    @Serializable
    /* loaded from: classes2.dex */
    public static final class Video {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        @c("thumb")
        private final String thumb;
        @c("video")
        private final String video;

        /* compiled from: ImagesAndOneVideoUploadResponse.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Video> serializer() {
                return ImagesAndOneVideoUploadResponse$Video$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Video(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i11 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 3, ImagesAndOneVideoUploadResponse$Video$$serializer.INSTANCE.getDescriptor());
            }
            this.video = str;
            this.thumb = str2;
        }

        public static /* synthetic */ Video copy$default(Video video, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = video.video;
            }
            if ((i11 & 2) != 0) {
                str2 = video.thumb;
            }
            return video.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self(Video video, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, video.video);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, video.thumb);
        }

        public final String component1() {
            return this.video;
        }

        public final String component2() {
            return this.thumb;
        }

        public final Video copy(String video, String thumb) {
            o.i(video, "video");
            o.i(thumb, "thumb");
            return new Video(video, thumb);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            if (o.d(this.video, video.video) && o.d(this.thumb, video.thumb)) {
                return true;
            }
            return false;
        }

        public final String getThumb() {
            return this.thumb;
        }

        public final String getVideo() {
            return this.video;
        }

        public int hashCode() {
            return (this.video.hashCode() * 31) + this.thumb.hashCode();
        }

        public String toString() {
            String str = this.video;
            String str2 = this.thumb;
            return "Video(video=" + str + ", thumb=" + str2 + ")";
        }

        public Video(String video, String thumb) {
            o.i(video, "video");
            o.i(thumb, "thumb");
            this.video = video;
            this.thumb = thumb;
        }
    }

    public /* synthetic */ ImagesAndOneVideoUploadResponse(int i11, List list, Video video, int i12, int i13, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i11 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 15, ImagesAndOneVideoUploadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.images = list;
        this.video = video;
        this.imageSuccessCount = i12;
        this.imageFailureCount = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImagesAndOneVideoUploadResponse copy$default(ImagesAndOneVideoUploadResponse imagesAndOneVideoUploadResponse, List list, Video video, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = imagesAndOneVideoUploadResponse.images;
        }
        if ((i13 & 2) != 0) {
            video = imagesAndOneVideoUploadResponse.video;
        }
        if ((i13 & 4) != 0) {
            i11 = imagesAndOneVideoUploadResponse.imageSuccessCount;
        }
        if ((i13 & 8) != 0) {
            i12 = imagesAndOneVideoUploadResponse.imageFailureCount;
        }
        return imagesAndOneVideoUploadResponse.copy(list, video, i11, i12);
    }

    public static final /* synthetic */ void write$Self(ImagesAndOneVideoUploadResponse imagesAndOneVideoUploadResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, $childSerializers[0], imagesAndOneVideoUploadResponse.images);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ImagesAndOneVideoUploadResponse$Video$$serializer.INSTANCE, imagesAndOneVideoUploadResponse.video);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, imagesAndOneVideoUploadResponse.imageSuccessCount);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, imagesAndOneVideoUploadResponse.imageFailureCount);
    }

    public final List<String> component1() {
        return this.images;
    }

    public final Video component2() {
        return this.video;
    }

    public final int component3() {
        return this.imageSuccessCount;
    }

    public final int component4() {
        return this.imageFailureCount;
    }

    public final ImagesAndOneVideoUploadResponse copy(List<String> list, Video video, int i11, int i12) {
        return new ImagesAndOneVideoUploadResponse(list, video, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesAndOneVideoUploadResponse)) {
            return false;
        }
        ImagesAndOneVideoUploadResponse imagesAndOneVideoUploadResponse = (ImagesAndOneVideoUploadResponse) obj;
        if (o.d(this.images, imagesAndOneVideoUploadResponse.images) && o.d(this.video, imagesAndOneVideoUploadResponse.video) && this.imageSuccessCount == imagesAndOneVideoUploadResponse.imageSuccessCount && this.imageFailureCount == imagesAndOneVideoUploadResponse.imageFailureCount) {
            return true;
        }
        return false;
    }

    public final int getImageFailureCount() {
        return this.imageFailureCount;
    }

    public final int getImageSuccessCount() {
        return this.imageSuccessCount;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode;
        List<String> list = this.images;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = hashCode * 31;
        Video video = this.video;
        if (video != null) {
            i11 = video.hashCode();
        }
        return ((((i12 + i11) * 31) + Integer.hashCode(this.imageSuccessCount)) * 31) + Integer.hashCode(this.imageFailureCount);
    }

    public String toString() {
        List<String> list = this.images;
        Video video = this.video;
        int i11 = this.imageSuccessCount;
        int i12 = this.imageFailureCount;
        return "ImagesAndOneVideoUploadResponse(images=" + list + ", video=" + video + ", imageSuccessCount=" + i11 + ", imageFailureCount=" + i12 + ")";
    }

    public ImagesAndOneVideoUploadResponse(List<String> list, Video video, int i11, int i12) {
        this.images = list;
        this.video = video;
        this.imageSuccessCount = i11;
        this.imageFailureCount = i12;
    }

    public static /* synthetic */ void getImageFailureCount$annotations() {
    }

    public static /* synthetic */ void getImageSuccessCount$annotations() {
    }

    public static /* synthetic */ void getImages$annotations() {
    }

    public static /* synthetic */ void getVideo$annotations() {
    }
}
