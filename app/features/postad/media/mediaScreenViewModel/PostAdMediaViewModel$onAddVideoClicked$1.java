package com.forsale.app.features.postad.media.mediaScreenViewModel;

import bf.h;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$onAddVideoClicked$1", f = "PostAdMediaViewModel.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$onAddVideoClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36317a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$onAddVideoClicked$1(PostAdMediaViewModel postAdMediaViewModel, a<? super PostAdMediaViewModel$onAddVideoClicked$1> aVar) {
        super(2, aVar);
        this.f36318b = postAdMediaViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$onAddVideoClicked$1(this.f36318b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f36317a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            VideoItemViewModel value = this.f36318b.J0().getValue();
            if (value != null) {
                PostAdMediaViewModel postAdMediaViewModel = this.f36318b;
                if (o.d(value.c().getValue(), kotlin.coroutines.jvm.internal.a.a(true))) {
                    postAdMediaViewModel.g1(value);
                }
            }
            bf.b value2 = this.f36318b.E0().getValue();
            if (value2 != null) {
                mutableSharedFlow = this.f36318b.f36290s0;
                h hVar = new h(value2.e(), value2.d());
                this.f36317a = 1;
                if (mutableSharedFlow.emit(hVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$onAddVideoClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}