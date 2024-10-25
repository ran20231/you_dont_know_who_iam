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
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$selectLocationPart$1$1", f = "PostAdLocationViewModel.kt", l = {382}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$selectLocationPart$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35760b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DistrictEntity f35761c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f35762d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$selectLocationPart$1$1(PostAdLocationViewModel postAdLocationViewModel, DistrictEntity districtEntity, int i11, zz.a<? super PostAdLocationViewModel$selectLocationPart$1$1> aVar) {
        super(2, aVar);
        this.f35760b = postAdLocationViewModel;
        this.f35761c = districtEntity;
        this.f35762d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$selectLocationPart$1$1(this.f35760b, this.f35761c, this.f35762d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35759a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdLocationViewModel postAdLocationViewModel = this.f35760b;
            DistrictEntity districtEntity = this.f35761c;
            this.f35759a = 1;
            if (PostAdLocationViewModel.L2(postAdLocationViewModel, districtEntity, false, this, 2, null) == f11) {
                return f11;
            }
        }
        wz.p pVar = wz.p.f75480a;
        PostAdLocationViewModel postAdLocationViewModel2 = this.f35760b;
        DistrictEntity districtEntity2 = this.f35761c;
        int i12 = this.f35762d;
        postAdLocationViewModel2.I2(districtEntity2);
        if (i12 == LocationLevels.AREA.getLevel()) {
            postAdLocationViewModel2.b2(districtEntity2.getId());
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$selectLocationPart$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
