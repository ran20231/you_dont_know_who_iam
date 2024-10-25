package com.forsale.app.features.postad.location;

import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$handleOneBlockArea$1", f = "PostAdLocationViewModel.kt", l = {399, 402}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$handleOneBlockArea$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35714a;

    /* renamed from: b  reason: collision with root package name */
    Object f35715b;

    /* renamed from: c  reason: collision with root package name */
    Object f35716c;

    /* renamed from: d  reason: collision with root package name */
    int f35717d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35718e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f35719f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$handleOneBlockArea$1(PostAdLocationViewModel postAdLocationViewModel, int i11, zz.a<? super PostAdLocationViewModel$handleOneBlockArea$1> aVar) {
        super(2, aVar);
        this.f35718e = postAdLocationViewModel;
        this.f35719f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$handleOneBlockArea$1(this.f35718e, this.f35719f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdLocationViewModel postAdLocationViewModel;
        Object k02;
        DistrictEntity districtEntity;
        f11 = b.f();
        int i11 = this.f35717d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    districtEntity = (DistrictEntity) this.f35716c;
                    postAdLocationViewModel = (PostAdLocationViewModel) this.f35715b;
                    List list = (List) this.f35714a;
                    f.b(obj);
                    wz.p pVar = wz.p.f75480a;
                    postAdLocationViewModel.I2(districtEntity);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            DistrictsRepository q12 = this.f35718e.q1();
            int level = LocationLevels.BLOCK.getLevel();
            int i12 = this.f35719f;
            this.f35717d = 1;
            obj = q12.getAllDistrictsByLevelAndParentId(level, i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        List list2 = (List) obj;
        if (list2 != null) {
            postAdLocationViewModel = this.f35718e;
            if (list2.size() == 1) {
                k02 = CollectionsKt___CollectionsKt.k0(list2);
                DistrictEntity districtEntity2 = (DistrictEntity) k02;
                if (districtEntity2 != null) {
                    this.f35714a = list2;
                    this.f35715b = postAdLocationViewModel;
                    this.f35716c = districtEntity2;
                    this.f35717d = 2;
                    if (PostAdLocationViewModel.L2(postAdLocationViewModel, districtEntity2, false, this, 2, null) == f11) {
                        return f11;
                    }
                    districtEntity = districtEntity2;
                    wz.p pVar2 = wz.p.f75480a;
                    postAdLocationViewModel.I2(districtEntity);
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$handleOneBlockArea$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
