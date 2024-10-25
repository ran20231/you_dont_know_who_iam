package com.forsale.app.features.postad.media.mediaScreenViewModel;

import android.net.Uri;
import androidx.lifecycle.b0;
import dj.g;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoItemViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.VideoItemViewModel$compressVideo$2", f = "VideoItemViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VideoItemViewModel$compressVideo$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VideoItemViewModel f36348b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f36349c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f36350d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f36351e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoItemViewModel$compressVideo$2(VideoItemViewModel videoItemViewModel, g gVar, String str, long j11, a<? super VideoItemViewModel$compressVideo$2> aVar) {
        super(2, aVar);
        this.f36348b = videoItemViewModel;
        this.f36349c = gVar;
        this.f36350d = str;
        this.f36351e = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VideoItemViewModel$compressVideo$2(this.f36348b, this.f36349c, this.f36350d, this.f36351e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        b.f();
        if (this.f36347a == 0) {
            f.b(obj);
            b0Var = this.f36348b.f36345d;
            b0Var.postValue(kotlin.coroutines.jvm.internal.a.a(true));
            try {
                String a11 = this.f36349c.a(Uri.parse(this.f36350d), this.f36351e);
                x10.a.b("Compressing Done", new Object[0]);
                this.f36348b.g(a11);
                b0Var3 = this.f36348b.f36345d;
                b0Var3.postValue(kotlin.coroutines.jvm.internal.a.a(false));
            } catch (Exception unused) {
                b0Var2 = this.f36348b.f36345d;
                b0Var2.postValue(kotlin.coroutines.jvm.internal.a.a(false));
                x10.a.b("Compressing Failed", new Object[0]);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VideoItemViewModel$compressVideo$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
