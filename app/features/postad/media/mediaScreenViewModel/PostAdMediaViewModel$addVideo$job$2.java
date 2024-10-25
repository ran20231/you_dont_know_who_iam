package com.forsale.app.features.postad.media.mediaScreenViewModel;

import dj.g;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$addVideo$job$2", f = "PostAdMediaViewModel.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$addVideo$job$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36296a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36297b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VideoItemViewModel f36298c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f36299d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Integer f36300e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$addVideo$job$2(PostAdMediaViewModel postAdMediaViewModel, VideoItemViewModel videoItemViewModel, String str, Integer num, a<? super PostAdMediaViewModel$addVideo$job$2> aVar) {
        super(2, aVar);
        this.f36297b = postAdMediaViewModel;
        this.f36298c = videoItemViewModel;
        this.f36299d = str;
        this.f36300e = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$addVideo$job$2(this.f36297b, this.f36298c, this.f36299d, this.f36300e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        g gVar;
        long j11;
        f11 = b.f();
        int i11 = this.f36296a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            this.f36297b.f36286o0.postValue(this.f36298c);
            VideoItemViewModel videoItemViewModel = this.f36298c;
            String str = this.f36299d;
            gVar = this.f36297b.f36283l0;
            Integer num = this.f36300e;
            if (num != null) {
                j11 = num.intValue();
            } else {
                j11 = 10485760;
            }
            this.f36296a = 1;
            if (videoItemViewModel.b(str, gVar, j11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$addVideo$job$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
