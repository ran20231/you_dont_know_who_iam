package com.forsale.app.features.postad.media.mediaScreenView;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$refreshProgress$1", f = "PostAdMediaFragment.kt", l = {292}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaFragment$refreshProgress$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36241a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaFragment f36242b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f36243c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaFragment$refreshProgress$1(PostAdMediaFragment postAdMediaFragment, int i11, zz.a<? super PostAdMediaFragment$refreshProgress$1> aVar) {
        super(1, aVar);
        this.f36242b = postAdMediaFragment;
        this.f36243c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMediaFragment$refreshProgress$1(this.f36242b, this.f36243c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36241a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f36242b.f36184g;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f36243c);
            this.f36241a = 1;
            if (mutableStateFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMediaFragment$refreshProgress$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
