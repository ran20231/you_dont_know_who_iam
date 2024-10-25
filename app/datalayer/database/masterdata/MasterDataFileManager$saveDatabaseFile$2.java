package com.forsale.app.datalayer.database.masterdata;

import dj.i;
import g00.p;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataFileManager.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.MasterDataFileManager$saveDatabaseFile$2", f = "MasterDataFileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataFileManager$saveDatabaseFile$2 extends SuspendLambda implements p<CoroutineScope, a<? super Long>, Object> {
    final /* synthetic */ byte[] $byteArray;
    int label;
    final /* synthetic */ MasterDataFileManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataFileManager$saveDatabaseFile$2(MasterDataFileManager masterDataFileManager, byte[] bArr, a<? super MasterDataFileManager$saveDatabaseFile$2> aVar) {
        super(2, aVar);
        this.this$0 = masterDataFileManager;
        this.$byteArray = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MasterDataFileManager$saveDatabaseFile$2(this.this$0, this.$byteArray, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String masterDataFilePath;
        b.f();
        if (this.label == 0) {
            f.b(obj);
            try {
                masterDataFilePath = this.this$0.getMasterDataFilePath();
                File file = new File(masterDataFilePath);
                if (file.exists()) {
                    file.delete();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.$byteArray);
                try {
                    long b11 = e00.a.b(byteArrayInputStream, bufferedOutputStream, 0, 2, null);
                    e00.b.a(byteArrayInputStream, null);
                    e00.b.a(bufferedOutputStream, null);
                    return kotlin.coroutines.jvm.internal.a.e(b11);
                } finally {
                }
            } catch (Exception e11) {
                i.f54287a.invoke().c(MasterDataStages.SAVING_FILE.getStageName());
                throw e11;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super Long> aVar) {
        return ((MasterDataFileManager$saveDatabaseFile$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
