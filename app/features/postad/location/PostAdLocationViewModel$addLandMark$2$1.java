package com.forsale.app.features.postad.location;

import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$addLandMark$2$1", f = "PostAdLocationViewModel.kt", l = {706}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$addLandMark$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35708a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35709b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<String> f35710c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$addLandMark$2$1(PostAdLocationViewModel postAdLocationViewModel, List<String> list, zz.a<? super PostAdLocationViewModel$addLandMark$2$1> aVar) {
        super(2, aVar);
        this.f35709b = postAdLocationViewModel;
        this.f35710c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$addLandMark$2$1(this.f35709b, this.f35710c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f35708a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35709b.f35685o1;
            List<String> list = this.f35710c;
            this.f35708a = 1;
            if (mutableSharedFlow.emit(list, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$addLandMark$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
