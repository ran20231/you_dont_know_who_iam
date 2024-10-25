package com.forsale.app.datalayer.database.masterdata;

import dj.i;
import g00.p;
import java.io.File;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataFileManager.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$cleanUpDownloadedFile$2", f = "MasterDataFileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataFileManager$cleanUpDownloadedFile$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {
    int label;
    final /* synthetic */ MasterDataFileManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataFileManager$cleanUpDownloadedFile$2(MasterDataFileManager masterDataFileManager, a<? super MasterDataFileManager$cleanUpDownloadedFile$2> aVar) {
        super(2, aVar);
        this.this$0 = masterDataFileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MasterDataFileManager$cleanUpDownloadedFile$2(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String masterDataFilePath;
        String masterDataFilePath2;
        b.f();
        if (this.label == 0) {
            f.b(obj);
            try {
                masterDataFilePath = this.this$0.getMasterDataFilePath();
                File file = new File(masterDataFilePath);
                if (file.exists()) {
                    Boolean a11 = kotlin.coroutines.jvm.internal.a.a(file.delete());
                    if (!a11.booleanValue()) {
                        a11 = null;
                    }
                    if (a11 == null) {
                        masterDataFilePath2 = this.this$0.getMasterDataFilePath();
                        throw new CleanUpDownloadedFileException("Failed to delete file: " + masterDataFilePath2);
                    }
                    a11.booleanValue();
                }
                return wz.p.f75480a;
            } catch (Exception e11) {
                i.f54287a.invoke().c(MasterDataStages.CLEANING.getStageName());
                throw e11;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((MasterDataFileManager$cleanUpDownloadedFile$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
