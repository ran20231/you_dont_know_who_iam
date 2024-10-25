package com.forsale.app.features.postad.location;

import com.forsale.app.datalayer.database.DistrictEntity;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$setCoordinates$2", f = "PostAdLocationViewModel.kt", l = {571}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$setCoordinates$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35765a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35766b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f35767c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f35768d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DistrictEntity f35769e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$setCoordinates$2(PostAdLocationViewModel postAdLocationViewModel, double d11, double d12, DistrictEntity districtEntity, zz.a<? super PostAdLocationViewModel$setCoordinates$2> aVar) {
        super(2, aVar);
        this.f35766b = postAdLocationViewModel;
        this.f35767c = d11;
        this.f35768d = d12;
        this.f35769e = districtEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$setCoordinates$2(this.f35766b, this.f35767c, this.f35768d, this.f35769e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object T2;
        f11 = b.f();
        int i11 = this.f35765a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdLocationViewModel postAdLocationViewModel = this.f35766b;
            double d11 = this.f35767c;
            double d12 = this.f35768d;
            DistrictEntity districtEntity = this.f35769e;
            this.f35765a = 1;
            T2 = postAdLocationViewModel.T2(d11, d12, districtEntity, this);
            if (T2 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$setCoordinates$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
