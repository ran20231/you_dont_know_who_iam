package com.forsale.app.features.categories.home.propertyhome.interactors;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MiscInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor$getCurrentRegion$2", f = "MiscInterActor.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MiscInterActor$getCurrentRegion$2 extends SuspendLambda implements p<CoroutineScope, a<? super RegionEntity>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25021a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MiscInterActor f25022b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiscInterActor$getCurrentRegion$2(MiscInterActor miscInterActor, a<? super MiscInterActor$getCurrentRegion$2> aVar) {
        super(2, aVar);
        this.f25022b = miscInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MiscInterActor$getCurrentRegion$2(this.f25022b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RegionsRepository regionsRepository;
        f11 = b.f();
        int i11 = this.f25021a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            regionsRepository = this.f25022b.f25019a;
            this.f25021a = 1;
            obj = regionsRepository.getCurrentRegion(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super RegionEntity> aVar) {
        return ((MiscInterActor$getCurrentRegion$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
