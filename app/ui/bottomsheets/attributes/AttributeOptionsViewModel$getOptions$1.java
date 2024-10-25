package com.forsale.app.ui.bottomsheets.attributes;

import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeOptionsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsViewModel$getOptions$1", f = "AttributeOptionsViewModel.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AttributeOptionsViewModel$getOptions$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f38032a;

    /* renamed from: b  reason: collision with root package name */
    int f38033b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeOptionsViewModel f38034c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f38035d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeOptionsViewModel$getOptions$1(AttributeOptionsViewModel attributeOptionsViewModel, int i11, a<? super AttributeOptionsViewModel$getOptions$1> aVar) {
        super(2, aVar);
        this.f38034c = attributeOptionsViewModel;
        this.f38035d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AttributeOptionsViewModel$getOptions$1(this.f38034c, this.f38035d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ExtraAttributeOptionDao extraAttributeOptionDao;
        AttributeOptionsViewModel attributeOptionsViewModel;
        f11 = b.f();
        int i11 = this.f38033b;
        if (i11 != 0) {
            if (i11 == 1) {
                attributeOptionsViewModel = (AttributeOptionsViewModel) this.f38032a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AttributeOptionsViewModel attributeOptionsViewModel2 = this.f38034c;
            extraAttributeOptionDao = attributeOptionsViewModel2.f38024a;
            int i12 = this.f38035d;
            this.f38032a = attributeOptionsViewModel2;
            this.f38033b = 1;
            Object extraAttributeOptionsBuAttributeId = extraAttributeOptionDao.getExtraAttributeOptionsBuAttributeId(i12, this);
            if (extraAttributeOptionsBuAttributeId == f11) {
                return f11;
            }
            attributeOptionsViewModel = attributeOptionsViewModel2;
            obj = extraAttributeOptionsBuAttributeId;
        }
        attributeOptionsViewModel.i((List) obj);
        List<ExtraAttributeOptionEntity> f12 = this.f38034c.f();
        o.g(f12, "null cannot be cast to non-null type java.util.ArrayList<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity>{ kotlin.collections.TypeAliasesKt.ArrayList<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity> }");
        ((ArrayList) f12).add(0, new ExtraAttributeOptionEntity(-1, this.f38035d, 0, this.f38034c.h().getString(y0.Ca, new Object[0]), this.f38034c.h().getString(y0.Ca, new Object[0])));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AttributeOptionsViewModel$getOptions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
