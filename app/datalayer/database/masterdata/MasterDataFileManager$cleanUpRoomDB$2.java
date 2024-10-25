package com.forsale.app.datalayer.database.masterdata;

import android.content.Context;
import dj.i;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataFileManager.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$cleanUpRoomDB$2", f = "MasterDataFileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataFileManager$cleanUpRoomDB$2 extends SuspendLambda implements p<CoroutineScope, a<? super Boolean>, Object> {
    int label;
    final /* synthetic */ MasterDataFileManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataFileManager$cleanUpRoomDB$2(MasterDataFileManager masterDataFileManager, a<? super MasterDataFileManager$cleanUpRoomDB$2> aVar) {
        super(2, aVar);
        this.this$0 = masterDataFileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MasterDataFileManager$cleanUpRoomDB$2(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        b.f();
        if (this.label == 0) {
            f.b(obj);
            try {
                context = this.this$0.appContext;
                return kotlin.coroutines.jvm.internal.a.a(context.deleteDatabase("master_data_db"));
            } catch (Exception e11) {
                i.f54287a.invoke().c(MasterDataStages.CLEANING_ROOM_DB.getStageName());
                throw e11;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super Boolean> aVar) {
        return ((MasterDataFileManager$cleanUpRoomDB$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
