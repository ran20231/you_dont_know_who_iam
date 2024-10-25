package com.forsale.app.features.postad.media.mediaScreenViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import dj.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import wz.p;
import zz.a;
/* compiled from: VideoItemViewModel.kt */
/* loaded from: classes2.dex */
public final class VideoItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private String f36342a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36343b;

    /* renamed from: c  reason: collision with root package name */
    private Job f36344c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<Boolean> f36345d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<Boolean> f36346e;

    public VideoItemViewModel(String videoUrl, String id2) {
        o.i(videoUrl, "videoUrl");
        o.i(id2, "id");
        this.f36342a = videoUrl;
        this.f36343b = id2;
        b0<Boolean> b0Var = new b0<>(Boolean.FALSE);
        this.f36345d = b0Var;
        this.f36346e = b0Var;
    }

    public final Object b(String str, g gVar, long j11, a<? super p> aVar) {
        Object f11;
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new VideoItemViewModel$compressVideo$2(this, gVar, str, j11, null), aVar);
        f11 = b.f();
        if (coroutineScope == f11) {
            return coroutineScope;
        }
        return p.f75480a;
    }

    public final LiveData<Boolean> c() {
        return this.f36346e;
    }

    public final Job d() {
        return this.f36344c;
    }

    public final String e() {
        return this.f36342a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItemViewModel)) {
            return false;
        }
        VideoItemViewModel videoItemViewModel = (VideoItemViewModel) obj;
        if (o.d(this.f36342a, videoItemViewModel.f36342a) && o.d(this.f36343b, videoItemViewModel.f36343b)) {
            return true;
        }
        return false;
    }

    public final void f(Job job) {
        this.f36344c = job;
    }

    public final void g(String str) {
        o.i(str, "<set-?>");
        this.f36342a = str;
    }

    public int hashCode() {
        return (this.f36342a.hashCode() * 31) + this.f36343b.hashCode();
    }

    public String toString() {
        String str = this.f36342a;
        String str2 = this.f36343b;
        return "VideoItemViewModel(videoUrl=" + str + ", id=" + str2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VideoItemViewModel(java.lang.String r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L11
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.h(r2, r3)
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenViewModel.VideoItemViewModel.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
