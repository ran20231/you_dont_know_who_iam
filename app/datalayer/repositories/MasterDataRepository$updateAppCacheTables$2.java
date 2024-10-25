package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.MasterDataBottomTooltipSettings;
import com.forsale.app.datalayer.database.MasterDataModel;
import g00.l;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository$updateAppCacheTables$2", f = "MasterDataRepository.kt", l = {391}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataRepository$updateAppCacheTables$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {
    final /* synthetic */ MasterDataModel $masterDataModel;
    int label;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$updateAppCacheTables$2(MasterDataModel masterDataModel, MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$updateAppCacheTables$2> aVar) {
        super(1, aVar);
        this.$masterDataModel = masterDataModel;
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MasterDataRepository$updateAppCacheTables$2(this.$masterDataModel, this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object updateBottomTipSettings;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MasterDataModel masterDataModel = this.$masterDataModel;
            MasterDataRepository masterDataRepository = this.this$0;
            List<MasterDataBottomTooltipSettings> bottomTooltipSettings = masterDataModel.getBottomTooltipSettings();
            this.label = 1;
            updateBottomTipSettings = masterDataRepository.updateBottomTipSettings(bottomTooltipSettings, this);
            if (updateBottomTipSettings == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MasterDataRepository$updateAppCacheTables$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
