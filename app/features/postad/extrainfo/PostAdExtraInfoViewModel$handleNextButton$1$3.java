package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$handleNextButton$1$3", f = "PostAdExtraInfoViewModel.kt", l = {131, 132}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$handleNextButton$1$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35532a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$handleNextButton$1$3(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$handleNextButton$1$3> aVar) {
        super(2, aVar);
        this.f35533b = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$handleNextButton$1$3(this.f35533b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        ApplicationResourcesRepository applicationResourcesRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35532a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            mutableStateFlow = this.f35533b.f35496x0;
            Long e11 = kotlin.coroutines.jvm.internal.a.e(System.currentTimeMillis());
            this.f35532a = 1;
            if (mutableStateFlow.emit(e11, this) == f11) {
                return f11;
            }
        }
        MutableSharedFlow<String> j02 = this.f35533b.j0();
        applicationResourcesRepository = this.f35533b.f35487o0;
        String string = applicationResourcesRepository.getString(y0.F4, new Object[0]);
        this.f35532a = 2;
        if (j02.emit(string, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$handleNextButton$1$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
