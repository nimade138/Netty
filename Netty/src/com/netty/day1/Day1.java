package com.netty.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
/**
 * 分支代码
 * @author Administrator
 *
 */
public class Day1 {
	/**
	 * FileChannel文件复制
	 * 
	 * @param src
	 * @param dst
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public static void fileChannelCopy(File src, File dst) throws IOException {
		FileChannel inChannel = new FileInputStream(src).getChannel();
		FileChannel outChannel = new FileOutputStream(dst).getChannel();
		inChannel.transferTo(0, inChannel.size(), outChannel);
		inChannel.close();
		outChannel.close();
	}

	public static void main(String[] args) {
		try {
			fileChannelCopy(new File("E:/luo/20190222 payment order.pdf"), new File("E:/luo/tmp/20190222 payment order.pdf"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
