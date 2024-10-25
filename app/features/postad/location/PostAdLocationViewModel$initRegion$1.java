package com.forsale.app.features.postad.location;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$initRegion$1", f = "PostAdLocationViewModel.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$initRegion$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35725a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35726b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f35727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$initRegion$1(PostAdLocationViewModel postAdLocationViewModel, Integer num, zz.a<? super PostAdLocationViewModel$initRegion$1> aVar) {
        super(2, aVar);
        this.f35726b = postAdLocationViewModel;
        this.f35727c = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$initRegion$1(this.f35726b, this.f35727c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel postAdViewModel;
        int i11;
        b0 b0Var;
        Integer Q1;
        b0 b0Var2;
        f11 = b.f();
        int i12 = this.f35725a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            DistrictsRepository q12 = this.f35726b.q1();
            postAdViewModel = this.f35726b.f35676k0;
            RegionEntity value = postAdViewModel.P2().getValue();
            if (value != null) {
                i11 = value.getId();
            } else {
                i11 = 1;
            }
            this.f35725a = 1;
            obj = q12.getDistrictByDistrictId(i11, this);
            if (obj == f11) {
                return f11;
            }
        }
        DistrictEntity districtEntity = (DistrictEntity) obj;
        if (districtEntity != null) {
            PostAdLocationViewModel postAdLocationViewModel = this.f35726b;
            Integer num = this.f35727c;
            b0Var = postAdLocationViewModel.f35698v0;
            b0Var.postValue(districtEntity);
            Q1 = postAdLocationViewModel.Q1(num);
            if ((Q1 == null || Q1.intValue() == -1) && districtEntity.getGeoLat() != null && districtEntity.getGeoLon() != null) {
                b0Var2 = postAdLocationViewModel.W0;
                b0Var2.postValue(new Pair(districtEntity.getGeoLat(), districtEntity.getGeoLon()));
                postAdLocationViewModel.F2(districtEntity.getGeoLat().doubleValue(), districtEntity.getGeoLon().doubleValue(), districtEntity);
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$initRegion$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
