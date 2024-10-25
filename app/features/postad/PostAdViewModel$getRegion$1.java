package com.forsale.app.features.postad;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$getRegion$1", f = "PostAdViewModel.kt", l = {406}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$getRegion$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34043a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34044b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$getRegion$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$getRegion$1> aVar) {
        super(2, aVar);
        this.f34044b = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$getRegion$1(this.f34044b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34043a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            RegionsRepository I = this.f34044b.I();
            this.f34043a = 1;
            obj = RegionsRepository.getRegion$default(I, null, this, 1, null);
            if (obj == f11) {
                return f11;
            }
        }
        PostAdViewModel postAdViewModel = this.f34044b;
        RegionEntity regionEntity = (RegionEntity) obj;
        postAdViewModel.P2().postValue(regionEntity);
        if (postAdViewModel.f33950n1 != null) {
            x10.a.b("UPLOAD_MEDIA: phoneParsingFactory yes", new Object[0]);
            postAdViewModel.C4(postAdViewModel.K2().a(regionEntity.getPhonePrefix(), regionEntity.getRegionCodeEn()));
        } else {
            x10.a.b("UPLOAD_MEDIA: phoneParsingFactory No", new Object[0]);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$getRegion$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
